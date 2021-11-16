package com.designpatterns.app.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract public class AbstractHandler {
    private AbstractHandler next;

    public AbstractHandler(AbstractHandler next) {
        this.next = next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public AbstractHandler getNext() {
        return this.next;
    }

    public void handleRequest(AbstractRequest request) {
        if (next != null) {
            next.handleRequest(request);
        }
        log.info("no handler found, end of the line.");
    }
}
