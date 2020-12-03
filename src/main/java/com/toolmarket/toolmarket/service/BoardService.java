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
    public List<BoardDto> getBoardlist(String type) {
        List<BoardDto> boardList = new ArrayList<>();
        if(type != null && type.equals("A01")){
            boardList = boardMapper.selectAllNotice();
        }else if(type != null && type.equals("A02")){
            boardList = boardMapper.selectAllQna();
        }
        System.out.println("boardList " + boardList);

        List<BoardDto> boardDtoList = new ArrayList<>();
        for ( BoardDto boardDto : boardList) {
            BoardDto boardDTO = BoardDto.builder()
                    .seq(boardDto.getSeq())
                    .title(boardDto.getTitle())
                    .content(boardDto.getContent())
                    .writer(boardDto.getWriter())
                    .cDate(boardDto.getCDate())
                    .build();

            boardDtoList.add(boardDTO);
        }
//
//        JSONArray jsonArray = new JSONArray();
//        for (int i = 0; i < boardDtoList.size(); i++) {
//
//            JSONObject data = new JSONObject();
//            data.put("groupId", boardDtoList.get(i).getGroupId());
//            data.put("seq", boardDtoList.get(i).getSeq());
//            data.put("writer", boardDtoList.get(i).getWriter());
//            data.put("title", boardDtoList.get(i).getTitle());
//            data.put("content", boardDtoList.get(i).getContent());
//            data.put("cDate", boardDtoList.get(i).getCDate());
//            data.put("uDate", boardDtoList.get(i).getUdate());
//            jsonArray.add(i, data);
//        }

        return boardList;
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