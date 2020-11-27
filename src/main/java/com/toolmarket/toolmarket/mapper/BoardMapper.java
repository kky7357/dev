package com.toolmarket.toolmarket.mapper;

import com.toolmarket.toolmarket.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    BoardDto selectById(long groupId, long seq);
    List<BoardDto> selectAll();
//    void insertBoard(BoardDto boardDto);
//    void updateById(BoardDto boardDto);
//    void deleteById(long seq);
}
