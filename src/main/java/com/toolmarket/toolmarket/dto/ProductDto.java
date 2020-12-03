package com.toolmarket.toolmarket.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductDto {
    private String cId;
    private Long pId;
    private String pName;
    private String pImage;

    @Builder
    public ProductDto (String cId, Long pId, String pName, String pImage) {
        this.cId = cId;
        this.pId = pId;
        this.pName = pName;
        this.pImage = pImage;
    }
}
