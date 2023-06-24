package com.board.service;

import com.board.dto.BoardDTO;
import com.board.reposiotry.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public int save(BoardDTO boardDTO){
        return boardRepository.save(boardDTO);
    }


}
