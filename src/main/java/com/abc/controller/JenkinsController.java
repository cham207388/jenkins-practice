package com.abc.controller;

import com.abc.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @Autowired
    private JenkinsService jenkinsService;

    @GetMapping
    public String hello(){
        return jenkinsService.hello();
    }
}
