package com.designpatterns.app.structural.bridge;

public class Corolla_L_Impl_NorthAmerica extends AbstractCorollaImpl {

    @Override
    void listSafetyEquipment() {
        System.out.println("High safety standard.");
    }

    @Override
    boolean isCarRightHanded() {
        return false;
    }
}
