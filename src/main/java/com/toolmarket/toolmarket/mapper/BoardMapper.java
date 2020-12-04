package com.toolmarket.toolmarket.mapper;

import com.toolmarket.toolmarket.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
//    BoardDto selectById(long groupId, long seq);
    List<BoardDto> selectAllNotice();
    List<BoardDto> selectAllBoard();
    List<BoardDto> selectAllQna();


//    void insertBoard(BoardDto boardDto);
//    void updateById(BoardDto boardDto);
//    void deleteById(long seq);
}
