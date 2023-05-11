package com.test.blog_board.mapper;

import com.test.blog_board.model.Board;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BoardMapper {

    int boardCount();
    List<Board> findAll();
    Board findById(Long boardId);
    Long save(Board board);
    Long update(Board board);
    void delete(Long boardId);
}
