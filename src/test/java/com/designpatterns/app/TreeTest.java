package com.designpatterns.app;

import com.designpatterns.app.datastructures.BinaryTree;
import com.designpatterns.app.model.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TreeTest {

    @Test
    public void testTreeConstruction(){
        BinaryTree tree = new BinaryTree();
        tree.insertNode(new TreeNode(100));
        tree.insertNode(new TreeNode(50));
        tree.insertNode(new TreeNode(25));
        tree.insertNode(new TreeNode(200));
        tree.insertNode(new TreeNode(350));
        //tree.insertNode(new TreeNode(26));
        System.out.println(tree.getHeight());
        List<TreeNode> path = new ArrayList<>();
        tree.inOrderTraversal(tree.getRoot(), path);
        log.info("{}", path);
        List<TreeNode> path2 = new ArrayList<>();
        tree.preOrderTraversal(tree.getRoot(), path2);
        log.info("{}", path2);
        List<TreeNode> path3 = new ArrayList<>();
        tree.postOrderTraversal(tree.getRoot(), path3);
        log.info("{}", path3);
    }
}
