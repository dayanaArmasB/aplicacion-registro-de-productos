package com.example.semana4bd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
    
    @RequestMapping("/")
    public String inicio(){
        return "inicio";
    }
}
