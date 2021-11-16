package com.designpatterns.app.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LowFuelHandler extends AbstractHandler {
    //only interested in handling requests with request code = 2
    private static int code = 2;

    public LowFuelHandler(AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(code == request.getRequestCode()) {
            log.info("handling a low fuel request of status code {}", request.getRequestCode());
        } else {
            //if the handler doesn't handle this type of request, call super and forward the request
            log.info("Forwarding the request to {}", this.getNext());
            super.handleRequest(request);
        }
    }
}
