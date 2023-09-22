package com.example.lab6_20190159.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/equipos")
public class EquiposController {
    @GetMapping("/lista")
    public String index(){
        return "Equipos/lista";
    }
}
