package com.designpatterns.app.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class F16 implements IAircraft {

    private ParkedState parkedState = new ParkedState(this);
    private CrashState crashState = new CrashState(this);
    private LandState landState = new LandState(this);
    private TaxiState taxiState = new TaxiState(this);
    private AirborneState airborneState = new AirborneState(this);
    IPilotActions state;

    public F16(IPilotActions state) {
        this.state = state;
    }

    public F16() {
        this.state = parkedState;
    }

    @Override
    public void fly() {
        log.info("Flying F16");
    }

    @Override
    public void land() {
        log.info("Landing F16");
    }

    void startsEngine() {
        state.pilotTaxies(this);
    }

    void fliesPlane() {
        state.pilotFlies(this);
    }

    void ejectsPlane(){
        state.pilotEjects(this);
    }

    void landsPlane() {
        state.pilotEjects(this);
    }

    void setState(IPilotActions IPilotActions) {
        state = IPilotActions;
    }

    ParkedState getParkedState() {
        return parkedState;
    }

    ParkedState getParkState() {
        return parkedState;
    }

    CrashState getCrashState() {
        return crashState;
    }

    LandState getLandState() {
        return landState;
    }

    TaxiState getTaxiState() {
        return taxiState;
    }

    public AirborneState getAirborneState() {
        return airborneState;
    }

}
