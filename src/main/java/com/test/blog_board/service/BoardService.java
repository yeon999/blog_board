package com.test.blog_board.service;

import com.test.blog_board.mapper.BoardMapper;
import com.test.blog_board.model.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class BoardService {
    private final BoardMapper boardMapper; //di

    public int boardCount(){
        return boardMapper.boardCount();
    }

    public List<Board> boardList(){
        return boardMapper.findAll();
    }

    public Board findById(Long boardId){
        return boardMapper.findById(boardId);
    }

    public Long add(Board board) {
        boardMapper.save(board);
        return board.getBoardId();
    }

    public Long update(Board board){
        return boardMapper.update(board);
    }

    public void deleteById(Long boardId) {
        boardMapper.delete(boardId);
    }

}

