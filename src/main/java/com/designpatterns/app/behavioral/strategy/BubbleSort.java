package com.designpatterns.app.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort implements ISort {
    @Override
    public void sort(int[] input) {
        //do crappy sorting
        log.info("bubble sort is called.");
    }
}
