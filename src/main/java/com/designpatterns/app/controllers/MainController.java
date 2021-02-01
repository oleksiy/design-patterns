package com.designpatterns.app.controllers;

import com.designpatterns.app.composition.FlyWithWings;
import com.designpatterns.app.composition.ModelDuck;
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
}
