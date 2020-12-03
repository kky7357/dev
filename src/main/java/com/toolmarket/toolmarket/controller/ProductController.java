package com.toolmarket.toolmarket.controller;

import com.toolmarket.toolmarket.dto.BoardDto;
import com.toolmarket.toolmarket.dto.ProductDto;
import com.toolmarket.toolmarket.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService productService;



    //리스트
    @GetMapping("/product")
    public ModelAndView list(@RequestParam(required = false) String type) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/product/ProductList");

        List<ProductDto> prodList = productService.getProductList(type);

        modelAndView.addObject("prodList",prodList);
        return modelAndView;
    }


//
//    @GetMapping("/detail/{no}")
//    public ModelAndView detail(@PathVariable("no") Long no, Model model) {
//        ModelAndView modelAndView = new ModelAndView();
//        ProductDto productDto = productService.getProduct(no);
//
//        model.addAttribute("productDto", productDto);
//        modelAndView.setViewName("product/ProductDetail");
//        return modelAndView;
//    }
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
