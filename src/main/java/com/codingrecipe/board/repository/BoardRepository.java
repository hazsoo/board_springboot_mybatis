package com.codingrecipe.board.repository;

import com.codingrecipe.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sql;
    public void save(BoardDTO boardDTO) {
        sql.insert("Board.save", boardDTO); // Board: mapper namespace, save: 쿼리문을 담고 있는 태그(id)
    }
}
