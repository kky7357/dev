package com.toolmarket.toolmarket.controller;

import com.toolmarket.toolmarket.dto.ProductDto;
import com.toolmarket.toolmarket.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    //리스트
    @GetMapping("/category")
    public ModelAndView list() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/product/Category");

        List<ProductDto> categoryList = productService.getCategorylist();

        modelAndView.addObject("categoryList",categoryList);
        return modelAndView;
    }

    @GetMapping("/detail/{no}")
    public ModelAndView detail(@PathVariable("no") Long no, Model model) {
        ModelAndView modelAndView = new ModelAndView();
        ProductDto productDto = productService.getProduct(no);

        model.addAttribute("productDto", productDto);
        modelAndView.setViewName("product/ProductDetail");
        return modelAndView;
    }
//
//    @GetMapping("/post/edit/{no}")
//    public ModelAndView edit(@PathVariable("no") Long no, Model model) {
//        ModelAndView modelAndView = new ModelAndView();
//        BoardDto boardDTO = boardService.getPost(no);
//
//        model.addAttribute("boardDto", boardDTO);
//        modelAndView.setViewName("board/update");
//        return modelAndView;
//    }
//
//    @PostMapping("/post/edit/{no}")
//    public ModelAndView update(BoardDto boardDTO) {
//        ModelAndView modelAndView = new ModelAndView();
//        boardService.updatePost(boardDTO);
//        modelAndView.setViewName("redirect:/list");
//        return modelAndView;
//    }
//
//    @PostMapping("/post/{no}")
//    public ModelAndView delete(@PathVariable("no") Long no) {
//        ModelAndView modelAndView = new ModelAndView();
//        boardService.deletePost(no);
//        modelAndView.setViewName("redirect:/list");
//        return modelAndView;
//    }
}
