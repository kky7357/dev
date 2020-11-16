package com.toolmarket.toolmarket.controller;

import com.toolmarket.toolmarket.dto.BoardDto;
import com.toolmarket.toolmarket.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {

    private BoardService boardService;

    @GetMapping("/")
    public String list() {
        return "board/list.html";
    }

    @GetMapping("/post")
    public String write() {
        return "board/write.html";
    }

    @PostMapping("/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect:/";
    }
}
