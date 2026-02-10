package com.example.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/{name}")
    @ResponseBody
    public String greet(@PathVariable(required = false) String name){
        System.out.println("name variable is " + name);
        return "index.html";
    }
}
