package com.toolmarket.toolmarket.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long seq;
    private String bType;
    private String title;
    private String writer;
    private String content;
    private String email;
    private LocalDateTime cDate;
    private LocalDateTime uDate;

    @Builder
    public BoardDto( Long seq, String bType, String title, String content, String writer, String email, LocalDateTime cDate, LocalDateTime uDate) {
        this.seq = seq;
        this.bType = bType;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.email = email;
        this.cDate = cDate;
        this.uDate = uDate;
    }
}
