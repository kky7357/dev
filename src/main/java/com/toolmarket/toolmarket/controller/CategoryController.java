package com.toolmarket.toolmarket.controller;

import com.toolmarket.toolmarket.dto.CategoryDto;
import com.toolmarket.toolmarket.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/category")
    public ModelAndView categoryList() {
        System.out.println("category : ");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/product/Category");

        List<CategoryDto> categoryList = categoryService.getCategory();
        System.out.println("category : " + categoryList);
        modelAndView.addObject("categoryList",categoryList);
        return modelAndView;
    }
}
