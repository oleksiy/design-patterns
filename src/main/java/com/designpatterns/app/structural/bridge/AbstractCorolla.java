package com.designpatterns.app.structural.bridge;

public abstract class AbstractCorolla {
    protected AbstractCorollaImpl corollaImpl;

    public AbstractCorolla(AbstractCorollaImpl corollaImpl) {
        this.corollaImpl = corollaImpl;
    }

    abstract void listSafetyEquipment();
    abstract boolean isCarRightHanded();
}
