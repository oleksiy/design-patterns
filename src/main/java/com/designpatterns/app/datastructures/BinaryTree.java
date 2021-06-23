package com.designpatterns.app.datastructures;

import com.designpatterns.app.model.TreeNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;
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
        //print root
        log.info("inorder: {}", start.getData());
        //right last
        inOrderTraversal(start.getRight());
    }

    //left, root, right
    public void inOrderTraversal(TreeNode start, List<TreeNode> path) {
        if(start == null) {
            return;
        }
        inOrderTraversal(start.getLeft(), path);
        path.add(start);
        inOrderTraversal(start.getRight(), path);
    }

    //left, right, root
    public void postOrderTraversal(TreeNode start, List<TreeNode> path) {
        if(start == null){
            return;
        }
        //left
        postOrderTraversal(start.getLeft(), path);
        //right
        postOrderTraversal(start.getRight(), path);
        //root
        path.add(start);
    }

    //root, left, right
    public void preOrderTraversal(TreeNode start, List<TreeNode> path) {
        if (start == null) {
            return;
        }
        path.add(start);
        preOrderTraversal(start.getLeft(), path);
        preOrderTraversal(start.getRight(), path);
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

    public int getHeight() {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.getLeft());
        int rightHeight = getHeight(root.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
