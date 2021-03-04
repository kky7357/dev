package com.toolmarket.toolmarket.service;

import com.toolmarket.toolmarket.dto.BoardDto;
import com.toolmarket.toolmarket.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardMapper boardMapper;

    @Transactional
    public List getBoardlist() {
        List<BoardDto> allBoardList = new ArrayList<>();
        allBoardList = boardMapper.selectAll();

        List<BoardDto> noticeList = new ArrayList<>();
        List<BoardDto> qnaList = new ArrayList<>();
        List<BoardDto> boardList = new ArrayList<>();

        for ( BoardDto list : allBoardList) {
            if(list.getBType().equals("B01")){
                BoardDto boardDto = BoardDto.builder()
                        .seq(list.getSeq())
                        .title(list.getTitle())
                        .content(list.getContent())
                        .writer(list.getWriter())
                        .cDate(list.getCDate())
                        .build();

                noticeList.add(boardDto);
            }else if (list.getBType().equals("B02")) {
                BoardDto boardDto = BoardDto.builder()
                        .seq(list.getSeq())
                        .title(list.getTitle())
                        .content(list.getContent())
                        .writer(list.getWriter())
                        .cDate(list.getCDate())
                        .build();

                qnaList.add(boardDto);
            }else if (list.getBType().equals("B03")) {
                BoardDto boardDto = BoardDto.builder()
                        .seq(list.getSeq())
                        .title(list.getTitle())
                        .content(list.getContent())
                        .writer(list.getWriter())
                        .cDate(list.getCDate())
                        .build();

                boardList.add(boardDto);
            }
        }

        List allList = new ArrayList();
        allList.add(noticeList);
        allList.add(qnaList);
        allList.add(boardList);

        return allList;
    }

    @Transactional
    public void savePost(BoardDto boardDto) {
        boardMapper.insertBoard(boardDto);
    }

    @Transactional
    public void updateBoard(BoardDto boardDto) {
        boardMapper.updateById(boardDto);
    }

    @Transactional
    public BoardDto getBoardDetail(Long seq) {
        BoardDto boardDto = boardMapper.selectById(seq);
        return boardDto;
    }
//
//    @Transactional
//    public void deletePost(Long id) {
//        boardMapper.deleteById(id);
//    }

}