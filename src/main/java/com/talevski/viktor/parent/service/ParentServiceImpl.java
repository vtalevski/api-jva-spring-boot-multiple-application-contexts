package com.talevski.viktor.parent.service;

import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements ParentService {

    @Override
    public String parentGreetings() {
        return "Parent says hello.";
    }
}
