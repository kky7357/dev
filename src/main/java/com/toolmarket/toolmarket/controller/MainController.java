package com.toolmarket.toolmarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("main");

        return modelAndView;
    }

    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pages/about");

        return modelAndView;
    }

    @GetMapping("/product")
    public ModelAndView product() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pages/product");

        return modelAndView;
    }

}
