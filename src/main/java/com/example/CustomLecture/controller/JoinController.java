package com.example.CustomLecture.controller;

import com.example.CustomLecture.dto.JoinDTO;
import com.example.CustomLecture.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    private JoinController(JoinService joinService){

        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(@RequestBody  JoinDTO joinDTO){

        joinService.joinProcess(joinDTO);

        return "ok";
    }

}
