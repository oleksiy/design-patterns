package com.designpatterns.app.behavioral.strategy;

public class Context {

    private ISort sortingDecision;

    public Context(ISort sortingDecision) {
        this.sortingDecision = sortingDecision;
    }

    // Context receives the data from its client
    // and passes it on to the strategy object.
    void sort(int[] numbers) {
        sortingDecision.sort(numbers);
    }

    // We can change the sorting algorithm using this setter
    public void setSortingDecision(ISort howDoISort) {
        this.sortingDecision = howDoISort;
    }
}
