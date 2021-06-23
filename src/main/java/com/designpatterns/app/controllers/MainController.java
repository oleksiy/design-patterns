package com.designpatterns.app.controllers;

import com.designpatterns.app.composition.FlyWithWings;
import com.designpatterns.app.composition.ModelDuck;
import com.designpatterns.app.datastructures.BinaryTree;
import com.designpatterns.app.model.Node;
import com.designpatterns.app.model.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {

    @GetMapping(path = "/composition")
    public String mainController(Model model) {
        log.info("Main controller.");
        ModelDuck duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyWithWings());
        duck.display();
        duck.performFly();
        duck.performQuack();
        model.addAttribute("message", "This is a message");
        return "main";
    }

    @GetMapping(path = "/binaryTree")
    public String binaryTree(Model model) {
        BinaryTree tree = new BinaryTree();
        tree.insertNode(new TreeNode(10));
        tree.insertNode(new TreeNode(11));
        tree.insertNode(new TreeNode(7));
        tree.insertNode(new TreeNode(9));
        tree.insertNode(new TreeNode(15));
        tree.insertNode(new TreeNode(8));
        tree.inOrderTraversal(tree.getRoot());
        log.info("This tree has a height of {}",tree.getHeight(tree.getRoot()));
        model.addAttribute("message", "Binary Tree Endpoint");
        return "binaryTree";
    }
}
