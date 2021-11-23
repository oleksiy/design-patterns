package com.designpatterns.app.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeSort implements ISort {
    @Override
    public void sort(int[] input) {
        // do merge sort
        log.info("merge sort is called");
    }
}
