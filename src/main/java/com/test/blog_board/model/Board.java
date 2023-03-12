package com.test.blog_board.model;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder //빌더패턴
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private Long boardId;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private Integer read;
    private String name;
    private Long memberId;

}

