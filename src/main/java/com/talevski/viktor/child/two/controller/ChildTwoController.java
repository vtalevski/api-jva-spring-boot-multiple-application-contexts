package com.talevski.viktor.child.two.controller;

import com.talevski.viktor.parent.service.ParentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildTwoController {
    private final ParentService parentService;

    public ChildTwoController(ParentService parentService) {
        this.parentService = parentService;
    }

    @GetMapping("/greetings")
    public String childOneGreetings() {
        return parentService.parentGreetings();
    }
}
