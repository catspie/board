package com.board.controller;

import com.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.board.dto.BoardDTO;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm(){
       return "save";
    }

    /*form처럼 주고받는 값이 정해져 있는 경우 dto 클래스를 사용해 형식적으로 값을 전달*/
    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        int saveResult = boardService.save(boardDTO);
        if (saveResult>0){
            //폼 전송 성공 시
            return "redirect:/board/";
        }else{
            //폼 전송 실패 시
            return "save";
        }
    }
}
