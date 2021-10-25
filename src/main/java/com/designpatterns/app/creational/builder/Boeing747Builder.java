package com.designpatterns.app.creational.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Boeing747Builder extends AircraftBuilder{
    Boeing747 boeing747;

    @Override
    public void buildEngine(){
        log.info("Building engine");
    }
    @Override
    public void buildWings(){
        log.info("Building wings");
    }
    @Override
    public void buildCockpit(){
        log.info("Building cockpit");
    }
    @Override
    public void buildBathrooms(){
        log.info("Building bathrooms");
    }
    @Override
    public IAircraft getResult() {
        return boeing747;
    }
}
