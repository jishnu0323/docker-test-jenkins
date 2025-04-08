package com.dockerexmpl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/page")
public class MainController {
    @GetMapping("/message")
    public String message(){
        return "hello duniya!";
    }
}
