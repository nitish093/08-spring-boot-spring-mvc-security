package com.luv2code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {

    //Changes for learning GIT
    @GetMapping("details")
    public void testMethod1(@PathVariable("details") String details)
    {
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Testing Pull");
        System.out.println("Testing Pull again...");
        
    }
}
