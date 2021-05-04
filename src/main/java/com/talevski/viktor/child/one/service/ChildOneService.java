package com.talevski.viktor.child.one.service;

import com.talevski.viktor.parent.service.ParentService;
import org.springframework.stereotype.Service;

@Service
public class ChildOneService implements ParentService {

    @Override
    public String parentGreetings() {
        return "Child one says hello.";
    }
}
