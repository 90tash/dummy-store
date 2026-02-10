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

    // how to show lists on html, create html
    // how to create array/list in java, append/add elements to this array
    // convert normal html page to template
    // pass this array to template

    @GetMapping("/products")
    public String product(Model model){
        List<String> productList = new ArrayList<>();
        productList.add("PS5");
        productList.add("Asus ROG");
        productList.add("Lenovo LOQ");
        productList.add("HP OMEN");
        model.addAttribute("productList", productList);
        return "products";
    }
}
