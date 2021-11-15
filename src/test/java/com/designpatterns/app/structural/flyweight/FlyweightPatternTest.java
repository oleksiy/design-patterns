package com.designpatterns.app.structural.flyweight;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class FlyweightPatternTest {
    @Test
    public void testFlyweightPatternStructure() {
        F16 flyweightF16 = new F16();
        int[][] f16coords = new int[5][5];
        for (int i = 0; i < f16coords.length; i++) {
            int currX = f16coords[i][0];
            int currY = f16coords[i][1];

            //we are passing in the extrinsic state to the flyweight object. This state is stored in a 2D array in this case

            log.info("Time to destination => {}", flyweightF16.getTimeToDesitnation(currX, currY, 10, 1, 200));
        }

    }
}
