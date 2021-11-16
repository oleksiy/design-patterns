package com.designpatterns.app.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FireHandler extends AbstractHandler {
    //only interested in handling requests with request code = 1
    private static int code = 1;

    public FireHandler(AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(code == request.getRequestCode()) {
            log.info("handling a fire request of status code {}", request.getRequestCode());
        } else {
            //if the handler doesn't handle this type of request, call super and forward the request
            log.info("Forwarding the request to {}", this.getNext());
            super.handleRequest(request);
        }
    }
}
