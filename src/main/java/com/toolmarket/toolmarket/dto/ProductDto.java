package com.toolmarket.toolmarket.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDto {
    private Long cId;
    private String cName;
    private String cImageUrl;

    @Builder
    public ProductDto (Long cId, String cName, String cImageUrl) {
        this.cId = cId;
        this.cName = cName;
        this.cImageUrl = cImageUrl;
    }
}
