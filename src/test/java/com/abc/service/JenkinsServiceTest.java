package com.abc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsServiceTest {


    @Test
    void hello() {
        JenkinsService service = new JenkinsService();
        assertEquals("Hello World Jenkins", service.hello());
    }

    @Test
    void jenkins() {
        JenkinsService service = new JenkinsService();
        assertEquals(1, service.jenkins());
    }
}