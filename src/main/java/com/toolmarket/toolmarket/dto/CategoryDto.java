package com.toolmarket.toolmarket.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CategoryDto {
    private String cId;
    private String cName;
    private String cImage;

    @Builder
    public CategoryDto (String cId, String cName, String cImage) {
        this.cId = cId;
        this.cName = cName;
        this.cImage = cImage;
    }
}
