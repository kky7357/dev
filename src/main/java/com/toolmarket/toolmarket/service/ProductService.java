package com.toolmarket.toolmarket.service;

import com.toolmarket.toolmarket.dto.CategoryDto;
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
    public List<CategoryDto> getCategory() {
        List<CategoryDto> categoryDtos = productMapper.selectAllcategory();
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        for (CategoryDto categoryDto : categoryDtos) {
            CategoryDto categoryDTO = CategoryDto.builder()
                    .cId(categoryDto.getCId())
                    .cName(categoryDto.getCName())
                    .cImage(categoryDto.getCImage())
                    .build();

            categoryDtoList.add(categoryDTO);
            System.out.println("categoryDtoList : " + categoryDtoList);
        }
        return categoryDtoList;
    }


    @Transactional
    public List<ProductDto> getProductList(String type) {
        List<ProductDto> productDtos = productMapper.selectProductByCategory(type);
        List<ProductDto> productDtoList = new ArrayList<>();
        for ( ProductDto productDto : productDtos) {
            ProductDto productDTO = ProductDto.builder()
                    .cId(productDto.getCId())
                    .pId(productDto.getPId())
                    .pName(productDto.getPName())
                    .pImage(productDto.getPImage())
                    .build();

            productDtoList.add(productDTO);
        }
        return productDtoList;
    }

    @Transactional
    public ProductDto getProduct(Long pId) {
        ProductDto productDto = productMapper.selectById(pId);
        return productDto;
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