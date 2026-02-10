package com.example.store;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/welcome/{name}")
    public String greet(Model model,  @PathVariable(required = false) String name){
        System.out.println("name variable is " + name);
        model.addAttribute("name", name);
        return "welcome";
    }
}
