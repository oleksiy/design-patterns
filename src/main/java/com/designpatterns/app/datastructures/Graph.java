package com.designpatterns.app.datastructures;

import com.designpatterns.app.model.Vertex;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Getter
@Slf4j
public class Graph {
    private final HashMap<Vertex, Set<Vertex>> adjacencyList;
    private int[][] adjacencyMatrix;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public Graph(List<Vertex> vertices) {
        this.adjacencyList = new HashMap<>();
        this.adjacencyMatrix = new int[vertices.size()][vertices.size()];
        for(Vertex v: vertices) {
            adjacencyList.put(v, new HashSet<>());
        }
    }

    public void addEdgeBiDi(Vertex u, Vertex v){
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public void addAllEdgesForVertexBiDi(Vertex u, List<Vertex> v) {
        adjacencyList.get(u).addAll(v);
        for(Vertex x : v) {
            adjacencyList.get(x).add(u);
        }
    }

    //assuming we're only dealing with numbers
    public void setAdjacencyMatrix(HashMap<Vertex, Set<Vertex>> adjList) {
        if(adjList == null || adjList.isEmpty()) {
            throw new UnsupportedOperationException("cannot set matrix.");
        }
        for(Vertex v : adjList.keySet()){
            for(Vertex u : adjList.get(v)) {
                this.adjacencyMatrix[v.getData()][u.getData()] = 1;
            }
        }
    }

    public String printAdjacencyList() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n--===Adjacency List===--");
        sb.append("\n");
        for(Vertex x: adjacencyList.keySet()) {
            sb.append("Vertex: " + x.getData() + " -> " + adjacencyList.get(x).toString());
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
