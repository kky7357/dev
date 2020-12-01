package com.toolmarket.toolmarket.controller;

import com.toolmarket.toolmarket.dto.BoardDto;
import com.toolmarket.toolmarket.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    //리스트
    @GetMapping("/boardList")
    public ModelAndView boardList() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("board/BoardList");

        return modelAndView;
    }

    @GetMapping("/getList")
    public List<Map<String, Object>> getList(HttpServletRequest req) {

        List<Map<String, Object>> boardList = boardService.getBoardlist(req.getParameter("groupId"));



        System.out.println("test : "+ boardList);
        return boardList;
    }

    //글쓰기폼
    @GetMapping("/post")
    public ModelAndView write() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("board/write");

        return modelAndView;
    }
//
//    //글쓰기
//    @PostMapping("/post")
//    public ModelAndView write(BoardDto boardDto) {
//        ModelAndView modelAndView = new ModelAndView();
//        boardService.savePost(boardDto);
//
//        modelAndView.setViewName("redirect:/list");
//        return modelAndView;
//    }
//
//    @GetMapping("/post/{no}")
//    public ModelAndView detail(@PathVariable("groupId")Long groupId, @PathVariable("no") Long no, Model model) {
//        ModelAndView modelAndView = new ModelAndView();
//        BoardDto boardDTO = boardService.getPost(groupId, no);
//
//        model.addAttribute("boardDto", boardDTO);
//        modelAndView.setViewName("board/detail");
//        return modelAndView;
//    }
//
//    @GetMapping("/post/edit/{no}")
//    public ModelAndView edit(@PathVariable("groupId") Long groupId, @PathVariable("no") Long no, Model model) {
//        ModelAndView modelAndView = new ModelAndView();
//        BoardDto boardDTO = boardService.getPost(groupId,no);
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
