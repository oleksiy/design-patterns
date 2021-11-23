package com.designpatterns.app.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StrategyPatternTest {
    @Test
    public void testStrategyPattern() {
        // Choose the sorting strategy
        BubbleSort bs = new BubbleSort();
        // Context receives the strategy object
        Context context = new Context(bs);
        context.sort(new int[1000]);
    }
}
