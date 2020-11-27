package com.toolmarket.toolmarket.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long groupId;
    private Long seq;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public BoardDto(Long groupId, Long seq, String title, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.groupId = groupId;
        this.seq = seq;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}