package com.nlsn.sample.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping
    public String greeting(Principal principal){
        return "Hello " + principal.getName();
    }
}
