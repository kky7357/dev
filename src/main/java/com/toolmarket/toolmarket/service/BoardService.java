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
    public List<BoardDto> getBoardlist() {
        List<BoardDto> boardDtos = boardMapper.selectAll();
        List<BoardDto> boardDtoList = new ArrayList<>();
        for ( BoardDto boardDto : boardDtos) {
            BoardDto boardDTO = BoardDto.builder()
                    .seq(boardDto.getSeq())
                    .title(boardDto.getTitle())
                    .content(boardDto.getContent())
                    .writer(boardDto.getWriter())
                    .createdDate(boardDto.getCreatedDate())
                    .build();

            boardDtoList.add(boardDTO);
        }
        return boardDtoList;
    }

//    @Transactional
//    public void savePost(BoardDto boardDto) {
//        boardMapper.insertBoard(boardDto);
//    }
//
//    @Transactional
//    public void updatePost(BoardDto boardDto) {
//        boardMapper.updateById(boardDto);
//    }
//    @Transactional
//    public BoardDto getPost(Long groupId, Long id) {
//        BoardDto boardDto = boardMapper.selectById(groupId, id);
//        return boardDto;
//    }
//
//    @Transactional
//    public void deletePost(Long id) {
//        boardMapper.deleteById(id);
//    }

}