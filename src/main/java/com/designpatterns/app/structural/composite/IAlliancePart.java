package com.designpatterns.app.structural.composite;

public interface IAlliancePart {
    /**
     * Any implementing class should return the number of
     * personnel required to operate the airforce in full: meaning
     * pilots, maintenance engineers, etc. etc.
     * @return the number of personnel
     */
    int getPersonnel();
}
