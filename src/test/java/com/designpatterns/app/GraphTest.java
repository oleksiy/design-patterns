package com.designpatterns.app;

import com.designpatterns.app.datastructures.Graph;
import com.designpatterns.app.model.Vertex;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class GraphTest {

    @Test
    public void testConstructor() {
        Graph g = new Graph();
        assertTrue(g.getAdjacencyMatrix() == null);
        assertThrows(UnsupportedOperationException.class, () -> {
            g.setAdjacencyMatrix(null);
        });
    }

    @Test
    public void testValuesConstructor(){
        List<Vertex> vertexList = List.of(Vertex.createFrom(0),
                Vertex.createFrom(1),
                Vertex.createFrom(2),
                Vertex.createFrom(3),
                Vertex.createFrom(4));
        Graph g = new Graph(vertexList);
        assertEquals(5, g.getAdjacencyList().size());
    }

    @Test
    public void testGraphAddMultipleEdges() {
        Vertex zero = Vertex.createFrom(0);
        Vertex one = Vertex.createFrom(1);
        Vertex two = Vertex.createFrom(2);
        Vertex three = Vertex.createFrom(3);
        Vertex four = Vertex.createFrom(4);
        List<Vertex> vertexList = List.of(zero, one, two, three, four);

        Graph g = new Graph(vertexList);
        g.addAllEdgesForVertexBiDi(zero, List.of(one, four));
        g.addAllEdgesForVertexBiDi(one, List.of(two, three, four, zero));
        g.addAllEdgesForVertexBiDi(two, List.of(one, three));
        g.addAllEdgesForVertexBiDi(three, List.of(one, two, four));
        g.addAllEdgesForVertexBiDi(four, List.of(zero, one, three));
        log.info(g.printAdjacencyList());
        g.setAdjacencyMatrix(g.getAdjacencyList());
        log.info(g.printAdjacencyMatrix());
        assertEquals(5, g.getAdjacencyList().size());

    }

    @Test
    public void testTwoDArray() {
        int[][] array = new int[5][5];
        log.info("Number of rows -> {}", array.length);
    }

    @Test
    public void testGetNeighbors() {
        Graph g = createASimpleGraph();
        Set<Vertex> neighbors = g.getAdjacentNodes(1);
        assertEquals(4, neighbors.size());
    }

    @Test
    public void testDFS() {
        Graph g = createASimpleGraph();
        List<Integer> path = g.DFS(0);
        assertEquals(5, path.size());
    }

    @Test
    public void testCollectionsSorting(){
        int[] a = {100, 52, -1, 3, 8, 11};
        Arrays.sort(a);
        Map<String, Integer> map = new HashMap<>();
        map.put("x", 5);
        map.put("y", 3);
        //System.out.println(map.get("x"));
        log.info("Sorted collection: {}", Arrays.toString(a));
        assertNotNull(a);
    }

    @Test
    public void testStringOperations(){
        String s = "a quick brown fox";
        String[] splitString = s.split("\\s");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        log.info("{}",list.contains(6));
        log.info("{}", Arrays.toString(splitString));
    }

    private Graph createASimpleGraph() {
        Vertex zero = Vertex.createFrom(0);
        Vertex one = Vertex.createFrom(1);
        Vertex two = Vertex.createFrom(2);
        Vertex three = Vertex.createFrom(3);
        Vertex four = Vertex.createFrom(4);
        List<Vertex> vertexList = List.of(zero, one, two, three, four);

        Graph g = new Graph(vertexList);
        g.addAllEdgesForVertexBiDi(zero, List.of(one, four));
        g.addAllEdgesForVertexBiDi(one, List.of(two, three, four, zero));
        g.addAllEdgesForVertexBiDi(two, List.of(one, three));
        g.addAllEdgesForVertexBiDi(three, List.of(one, two, four));
        g.addAllEdgesForVertexBiDi(four, List.of(zero, one, three));
        log.info(g.printAdjacencyList());
        return g;
    }


}
