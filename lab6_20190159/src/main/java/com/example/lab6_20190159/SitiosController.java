package com.example.lab6_20190159;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sitios")
public class SitiosController {

    @GetMapping("/lista")
    public String index(){
        return "Sitios/lista";
    }
}
