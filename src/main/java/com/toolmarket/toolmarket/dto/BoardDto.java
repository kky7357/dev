package com.toolmarket.toolmarket.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long seq;
    private String title;
    private String writer;
    private String content;
    private LocalDateTime cDate;
    private LocalDateTime uDate;

    @Builder
    public BoardDto(Long seq, String title, String content, String writer, LocalDateTime cDate, LocalDateTime uDate) {
        this.seq = seq;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.cDate = cDate;
        this.uDate = uDate;
    }
}
