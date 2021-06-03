package com.designpatterns.app.mazesolver;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class MazeSolverTest {

    private int[][] maze;
    private int size;


    public void init(){
        maze = new int[][]{
                {0, 0, 1},
                {1, 0, 0},
                {1, 1, 0}};
        size = 3;
    }

    @Test
    public void testInitialization(){
        init();
        MazeSolver mz = new MazeSolver(maze, size);
        log.info("{}", mz);
        assertNotNull(mz.getSolution());
    }

    @Test
    public void testMazeSolver(){
        init();
        MazeSolver mz = new MazeSolver(maze, size);
        boolean solvable = mz.solveMaze(maze, 0,0, mz.getSolution());
        log.info("is it solvable {}", solvable);
        assertEquals(true, solvable);
    }
}
