package org.redrock.controller;

import org.redrock.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return testService.testService(name);
    }
}
