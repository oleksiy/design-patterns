package com.designpatterns.app;

import com.designpatterns.app.datastructures.Graph;
import com.designpatterns.app.model.Vertex;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class GraphTest {

    @Test
    public void testConstructor() {
        Graph g = new Graph();
        g.setAdjacencyMatrix(null);
        assertTrue(g != null);
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
}
