package com.toolmarket.toolmarket.controller;

import com.toolmarket.toolmarket.dto.CategoryDto;
import com.toolmarket.toolmarket.dto.ProductDto;
import com.toolmarket.toolmarket.service.BoardService;
import com.toolmarket.toolmarket.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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







}
