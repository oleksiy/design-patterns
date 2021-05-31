package com.designpatterns.app.datastructures;

import com.designpatterns.app.model.Vertex;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Getter
@Slf4j
public class Graph {
    private final HashMap<Integer, Set<Vertex>> adjacencyList;
    private int[][] adjacencyMatrix;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public Graph(List<Vertex> vertices) {
        this.adjacencyList = new HashMap<>();
        this.adjacencyMatrix = new int[vertices.size()][vertices.size()];
        for(Vertex v: vertices) {
            adjacencyList.put(v.getData(), new HashSet<>());
        }
    }

    public void addEdgeBiDi(Vertex u, Vertex v){
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public void addAllEdgesForVertexBiDi(Vertex u, List<Vertex> v) {
        adjacencyList.get(u.getData()).addAll(v);
        for(Vertex x : v) {
            adjacencyList.get(x.getData()).add(u);
        }
    }

    public Set<Vertex> getAdjacentNodes(int x) {
        return this.adjacencyList.get(x);
    }

    public Set<Integer> getAllVertices() {
        return this.adjacencyList.keySet();
    }

    public List<Integer> DFS(int start){
        log.info("Starting DFS from {}", start);
        List<Integer> visited = new ArrayList<>();
        runDFS(start, visited);
        return visited;
    }

    private void runDFS(int vertex, List<Integer> visited){
        log.info("Marking {} as visited.", vertex);
        visited.add(vertex);
        Set<Vertex> neighbors = this.getAdjacentNodes(vertex);
        for(Vertex v : neighbors) {
            if(!visited.contains(v.getData())) {
                runDFS(v.getData(), visited);
            }
        }
    }


    //assuming we're only dealing with numbers
    public void setAdjacencyMatrix(HashMap<Integer, Set<Vertex>> adjList) {
        if(adjList == null || adjList.isEmpty()) {
            throw new UnsupportedOperationException("cannot set matrix.");
        }
        for(Integer v : adjList.keySet()){
            for(Vertex u : adjList.get(v)) {
                this.adjacencyMatrix[v][u.getData()] = 1;
            }
        }
    }

    public String printAdjacencyList() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n--===Adjacency List===--");
        sb.append("\n");
        for(int x: adjacencyList.keySet()) {
            sb.append("Vertex: " + x + " -> " + adjacencyList.get(x).toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String printAdjacencyMatrix() {
        if(this.adjacencyMatrix == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        sb.append("\n");
        sb.append("~ADJACENCY MATRIX~\n");
        sb.append("       ");
        for(int r = 0; r < adjacencyMatrix.length; r++){
            sb.append(r + " ");
        }
        sb.append("\n-----------------------------------------------\n");
        for(int r = 0; r < adjacencyMatrix.length; r++){
            sb.append(r + " ->   ");
            for(int c = 0; c < adjacencyMatrix.length; c++) {
                sb.append(adjacencyMatrix[r][c] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
