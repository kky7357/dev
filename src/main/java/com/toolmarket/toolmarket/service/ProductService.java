package com.toolmarket.toolmarket.service;

import com.toolmarket.toolmarket.dto.ProductDto;
import com.toolmarket.toolmarket.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private ProductMapper productMapper;

    @Transactional
    public List<ProductDto> getCategorylist() {
        List<ProductDto> productDtos = productMapper.selectAllCategory();
        List<ProductDto> productDtoList = new ArrayList<>();
        for ( ProductDto productDto : productDtos) {
            ProductDto productDTO = ProductDto.builder()
                    .cId(productDto.getCId())
                    .cName(productDto.getCName())
                    .cImageUrl(productDto.getCImageUrl())
                    .build();

            productDtoList.add(productDTO);
        }
        return productDtoList;
    }

    @Transactional
    public ProductDto getProduct(Long cId) {
        ProductDto productDto = productMapper.selectById(cId);
        return productDto;
    }
//
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
//    public BoardDto getPost(Long id) {
//        BoardDto boardDto = boardMapper.selectById(id);
//        return boardDto;
//    }
//
//    @Transactional
//    public void deletePost(Long id) {
//        boardMapper.deleteById(id);
//    }

}