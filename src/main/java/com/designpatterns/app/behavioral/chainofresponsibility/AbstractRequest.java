package com.designpatterns.app.behavioral.chainofresponsibility;

abstract public class AbstractRequest {
    //each request is identified by its code
    //fire request: 1, low fuel request: 2
    private int requestCode;

    public AbstractRequest(int requestCode) {
        this.requestCode = requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }
}
