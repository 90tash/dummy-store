package com.example.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/products")
    public String product(Model model, @RequestParam(required = false) boolean order){
        List<String> productList = new ArrayList<>();
        productList.add("PS5");
        productList.add("Asus ROG");
        productList.add("Lenovo LOQ");
        productList.add("HP OMEN");
        model.addAttribute("productList", productList);
        model.addAttribute("order", order);
        return "products";
    }
}
