package com.board.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import oracle.sql.TIMESTAMP;

@Getter
@Setter
@ToString
public class BoardDTO {
    private long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private TIMESTAMP boardCreatedTime;
    private int boardHits;
    private int fileAttached;
}
