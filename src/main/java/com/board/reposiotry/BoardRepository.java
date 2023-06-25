package com.board.reposiotry;

import com.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sql;

    public int save(BoardDTO boardDTO) {
        return sql.insert("Board.save", boardDTO);
    }

    //넘겨주는 값이 없으므로 파라미터 값이 하나만 필요함
    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }
}
