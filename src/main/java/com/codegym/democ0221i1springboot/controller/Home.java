package com.codegym.democ0221i1springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/user")
    public String home(){
        return "user";
    }
}

