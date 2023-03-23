package com.project.snsservice.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

    @GetMapping("/test")
    public String test() {
        return "test.html";
    }

    @GetMapping("/test/chat")
    public String testChat() {
        return "chat/chat.html";
    }
}
