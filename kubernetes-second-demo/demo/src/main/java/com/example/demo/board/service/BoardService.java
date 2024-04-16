package com.example.demo.board.service;

import com.example.demo.board.model.Board;
import com.example.demo.board.model.BoardDto;
import com.example.demo.common.service.CommandService;
import com.example.demo.common.service.QueryService;

import java.util.Optional;

public interface BoardService extends CommandService<Board>, QueryService<BoardDto> {

    default Board dtoToEntity(BoardDto dto) {
        return Board.builder()
                .id(dto.getId())
                .boardName(dto.getBoardName())
                .boardType(dto.getBoardType())
                .build();
    }

    default BoardDto entityToDto(Board ent) {
        return BoardDto.builder()
                .id(ent.getId())
                .boardName(ent.getBoardName())
                .boardType(ent.getBoardType())
//                .articles(ent.getArticles().stream().filter(i->(i.getId())))
                .build();
    }
}
