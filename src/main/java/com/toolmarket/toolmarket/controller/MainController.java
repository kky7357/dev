package com.toolmarket.toolmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {


    @GetMapping("/")
    public String main() {
        return "layout/main";
    }

    @GetMapping("/about")
    public String about() {
        return "layout/about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "layout/contact";
    }

    @GetMapping("/elements")
    public String elements() {
        return "layout/elements";
    }





}
