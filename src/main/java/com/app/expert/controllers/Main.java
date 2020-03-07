package com.app.expert.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Main {
    @GetMapping("/main")
    public String main(){
        return "main";
    }


}
