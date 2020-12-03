package com.toolmarket.toolmarket.service;

import com.toolmarket.toolmarket.dto.CategoryDto;
import com.toolmarket.toolmarket.mapper.CategoryMapper;
import com.toolmarket.toolmarket.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CategoryService {
    private CategoryMapper categoryMapper;

    @Transactional
    public List<CategoryDto> getCategory() {
        List<CategoryDto> categoryDtos = categoryMapper.selectAllcategory();
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
}