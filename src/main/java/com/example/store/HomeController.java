package com.example.store;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/welcome/{name}")
    public String welcome(Model model,  @PathVariable(required = false) String name){
        System.out.println("name variable is " + name);
        model.addAttribute("name", name);
        return "welcome";
    }

    @GetMapping("/greet")
    public String greet(Model model, @RequestParam(required = true) String name){
        System.out.println("name variable is " + name);
        model.addAttribute("name", name);
        return "welcome";
    }
}
