package com.designpatterns.app.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MetricsVisitor implements IAircraftVisitor {
    public void visitF16(F16 f16){
        // Logic to get metrics for F16
        log.info("Attempting to visit F16");
    }

    public void visitBoeing747(Boeing747 boeing747){
        // Logic to get metrics for Boeing 747
        log.info("Attempting to visit Boeing 747");
    }

    public void printAccumulatedResults(){
        log.info("Printing results");
    }
}
