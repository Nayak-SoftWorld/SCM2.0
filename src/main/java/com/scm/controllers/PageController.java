package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page Controller !");
        model.addAttribute("name1","Peter Das");
        model.addAttribute("name2","John Tiwari");
        return "home";
    }
}
