package com.designpatterns.app.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PriceVisitor implements IAircraftVisitor{
    @Override
    public void visitF16(F16 f16) {
        log.info("-> calculating price for f16");
    }

    @Override
    public void visitBoeing747(Boeing747 boeing747) {
        log.info("-> calculating price for Boeing 747");
    }
}
