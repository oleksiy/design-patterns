package com.designpatterns.app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class Node {
    private int data;

    public Node(int x){
        this.data = x;
    }
}
