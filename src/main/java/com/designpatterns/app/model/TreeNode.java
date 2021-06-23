package com.designpatterns.app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode extends Node {
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int x) {
        super(x);
        this.left = null;
        this.right = null;
    }

    public TreeNode() {
        super();
        this.left = null;
        this.right = null;
    }
}
