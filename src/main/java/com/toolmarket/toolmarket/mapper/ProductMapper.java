package com.toolmarket.toolmarket.mapper;

import com.toolmarket.toolmarket.dto.ProductDto;

import java.util.List;

public interface ProductMapper {

    List<ProductDto> selectAllCategory();
    ProductDto selectById(long cId);
//    void insertBoard(BoardDto boardDto);
//    void updateById(BoardDto boardDto);
//    void deleteById(long id);

}
