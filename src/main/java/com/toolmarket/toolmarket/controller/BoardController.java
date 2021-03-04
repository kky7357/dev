package com.toolmarket.toolmarket.controller;

import com.toolmarket.toolmarket.dto.BoardDto;
import com.toolmarket.toolmarket.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;
    //리스트


    @GetMapping("/board")
    public String boardList(Model model) {

        List<BoardDto> allList = new ArrayList<>();
        allList = boardService.getBoardlist();

        model.addAttribute("noticeList",allList.get(0));
        model.addAttribute("qnaList",allList.get(1));
        model.addAttribute("boardList",allList.get(2));

        return "board/BoardList";
    }

    //글쓰기폼
    @GetMapping("/write")
    public String write(String bType, Model model) {
        model.addAttribute("bType", bType);
        return "board/BoardWrite";
    }

    //글쓰기
    @PostMapping("/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect:/board";
    }

    @GetMapping("/boardDetail")
    public String boardDetail(Long seq, Model model) {
        BoardDto boardDTO = boardService.getBoardDetail(seq);

        model.addAttribute("boardDto", boardDTO);
        return "board/BoardDetail";
    }

    @GetMapping("/boardUpdate")
    public String boardUpdate(Long seq, Model model) {
        BoardDto boardDTO = boardService.getBoardDetail(seq);
        System.out.println("boardDTO " + boardDTO);

        model.addAttribute("boardDto", boardDTO);
        return "board/BoardUpdate";
    }

    @PostMapping("/updatePost")
    public String edit(BoardDto boardDto){
        System.out.println("edit "+ boardDto);
        boardService.updateBoard(boardDto);
        return "redirect:/board";
    }
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
