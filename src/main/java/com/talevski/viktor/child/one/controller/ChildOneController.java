package com.talevski.viktor.child.one.controller;

import com.talevski.viktor.parent.service.ParentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChildOneController {
    private final ParentService parentService;

    public ChildOneController(ParentService parentService) {
        this.parentService = parentService;
    }

    @GetMapping("/greetings")
    public String childOneGreetings() {
        return parentService.parentGreetings();
    }
}
