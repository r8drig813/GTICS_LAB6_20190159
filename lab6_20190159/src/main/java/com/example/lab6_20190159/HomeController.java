package com.example.lab6_20190159;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("")
    public String index(){
        return "index";
    }
}
