package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {

    @RequestMapping("/offers")
    public String showHome(){
        System.out.println("came");
        return "index";
    }

}
