package com.designpatterns.app.mazesolver;

import io.swagger.v3.oas.models.links.Link;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@AllArgsConstructor
@Getter
public class MazeSolver {
    private final int[][] maze;
    private final int size;
    private final int[][] solution;

    public MazeSolver(int[][] maze, int size){
        this.maze = maze;
        this.size = size;
        this.solution = new int[size][size];
        initSolution(this.solution);

    }

    private void initSolution(int[][]solution){
        for(int r=0; r < solution.length; r++){
            for(int c=0; c < solution[r].length; c++){
                solution[r][c] = 1;
            }
        }
    }

    public boolean isLegalMove(int[][] maze, int x, int y) {
        //if x is within bounds, and y is within bounds, and pos(x,y) = 0
        //This means we have a legal move
        if (x >= 0 && x < size &&
        y >= 0 && y < size && maze[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean solveMaze(int[][]maze, int x, int y, int[][]solution) {
        //if we have reached our goal, the maze is solved
        if(x == size - 1 && y == size - 1 && maze[x][y] == 0) {
            solution[x][y] = 0;
            return true;
        }
        if(isLegalMove(maze, x, y)) {
            //check if current cell is already part of the solution
            if(solution[x][y] == 0) {
                return false;
            }

            //mark x,y as part of the solution path
            solution[x][y] = 0;

            //move forward in x direction
            if(solveMaze(maze, x+1, y, solution))
                return true;

            //move down in y direction
            if(solveMaze(maze, x, y+1, solution))
                return true;

            //move back in x direction
            if(solveMaze(maze, x-1, y, solution))
                return true;

            //move up in y direction
            if(solveMaze(maze, x, y-1, solution))
                return true;

            //if none of the moves work, unmark x,y as part of the solution
            //and backtrack
            solution[x][y] = 1;
            return false;
        }
        return false;
    }


    public Map<Integer, ArrayList<Integer>> buildAdjacencyList(){
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < size; i++) {
            map.put(i, new ArrayList<>());
        }

        //go through adjacency matrix and turn it into a list 0 means valid connection
        //1 means invalid
        for(int r = 0; r < maze.length; r++) {
            for(int c = 0; c < maze[r].length; c++) {
                //valid entry
                if(maze[r][c] == 0) {
                    map.get(r).add(c);
                }
                //we don't care about invalid moves
            }
        }
        return map;

    }

    public List<Boolean> runBFS(){
        List<Boolean> visited = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> adj = buildAdjacencyList();
        int current = 0;
        Queue<Integer> q = new LinkedList<>();
        visited.add(true);
        q.add(current);
        while(!q.isEmpty()) {
            current = q.peek();
            q.remove();
            for(int i: adj.get(current)) {
                if(visited.get(i) == null && visited.get(i) == false) {
                    visited.add(true);
                    q.add(i);
                }
            }
        }
        return visited;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\n");
        for(int r=0; r < this.solution.length; r++){
            sb.append(Arrays.toString(this.solution[r]));
            sb.append("\n");
        }
        return "Solution is: " + sb.toString();
    }
}
