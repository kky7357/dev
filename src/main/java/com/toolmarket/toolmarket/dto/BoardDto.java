package com.toolmarket.toolmarket.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private String groupId;
    private Long seq;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime cDate;
    private LocalDateTime udate;

    @Builder
    public BoardDto(String groupId, Long seq, String title, String content, String writer, LocalDateTime cDate, LocalDateTime udate) {
        this.groupId = groupId;
        this.seq = seq;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.cDate = cDate;
        this.udate = udate;
    }
}