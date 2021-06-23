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

    @Test
    public void testReverseNumber() {
        int x = 1534236469;
        long y = 9646324351L;
        int fullNumber = 0;
        while(x != 0) {
            int lastNumber = x % 10;
            long overflowCheck = (long)fullNumber*10L + (long)lastNumber;
            fullNumber *=10;
            if(overflowCheck > Integer.MAX_VALUE || overflowCheck < Integer.MIN_VALUE){
                log.info("Overflow detected");
            }
            fullNumber += lastNumber;
            log.info("{}", lastNumber);
            x /= 10;
        }
        log.info("Full Num {} max number {}",fullNumber, Integer.MAX_VALUE);
    }
}
