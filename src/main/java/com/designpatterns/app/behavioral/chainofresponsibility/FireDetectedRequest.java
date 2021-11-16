package com.designpatterns.app.behavioral.chainofresponsibility;

public class FireDetectedRequest extends AbstractRequest {

    //fire requests are code 1
    public FireDetectedRequest() {
        super(1);
    }
}
