package com.designpatterns.app.datastructures;

import com.designpatterns.app.model.Node;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

@AllArgsConstructor
@Slf4j
@Getter
@NoArgsConstructor
public class BinaryTree {
    private Node root;

    //left, root, right
    public void inOrderTraversal(Node start) {
        if (start == null) {
            return;
        }
        //left first
        inOrderTraversal(start.getLeft());
        log.info("inorder: {}", start.getData());
        inOrderTraversal(start.getRight());
    }

    //root, left, right
    public void preOrderTraversal(Node start) {
        if (start == null) {
            return;
        }
        log.info("preorder: {}", start.getData());
        inOrderTraversal(start.getLeft());
        inOrderTraversal(start.getRight());
    }

    public boolean insertNode(Node n) {
        Node current;
        if (root == null || root.getData() == 0) {
            root = new Node();
            root.setData(n.getData());
            root.setLeft(null);
            root.setRight(null);
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            current = queue.peek();
            queue.remove();
            if (current.getLeft() == null) {
                current.setLeft(n);
                break;
            } else {
                queue.add(current.getLeft());
            }

            if(current.getRight() == null) {
                current.setRight(n);
                break;
            } else {
                queue.add(current.getRight());
            }
        }
        return true;
    }

    public int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
