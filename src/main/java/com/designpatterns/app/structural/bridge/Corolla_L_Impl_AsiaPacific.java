package com.designpatterns.app.structural.bridge;

public class Corolla_L_Impl_AsiaPacific extends AbstractCorollaImpl {

    @Override
    void listSafetyEquipment() {
        System.out.println("Lower safety standard.");
    }

    @Override
    boolean isCarRightHanded() {
        return true;
    }
}
