package com.abc.service;

import org.springframework.stereotype.Service;

@Service
public class JenkinsService {

    public String hello(){
        return "Hello World Jenkins";
    }

    public int jenkins(){
        return 1;
    }
}
