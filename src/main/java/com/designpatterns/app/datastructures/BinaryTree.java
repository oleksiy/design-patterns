package com.designpatterns.app.datastructures;

import com.designpatterns.app.model.TreeNode;
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
    private TreeNode root;

    //left, root, right
    public void inOrderTraversal(TreeNode start) {
        if (start == null) {
            return;
        }
        //left first
        inOrderTraversal(start.getLeft());
        log.info("inorder: {}", start.getData());
        inOrderTraversal(start.getRight());
    }

    //root, left, right
    public void preOrderTraversal(TreeNode start) {
        if (start == null) {
            return;
        }
        log.info("preorder: {}", start.getData());
        preOrderTraversal(start.getLeft());
        preOrderTraversal(start.getRight());
    }

    public boolean insertNode(TreeNode n) {
        TreeNode current;
        if (root == null || root.getData() == 0) {
            root = new TreeNode();
            root.setData(n.getData());
            root.setLeft(null);
            root.setRight(null);
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
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

    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
