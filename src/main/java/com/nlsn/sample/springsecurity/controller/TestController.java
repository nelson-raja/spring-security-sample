package com.nlsn.sample.springsecurity.controller;

import com.nlsn.sample.springsecurity.dto.LoginRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/secure")
public class TestController {

    @GetMapping
    public String greeting(Principal principal){
        return "Hello " + principal.getName();
    }

}

@RestController
@RequestMapping("/unsecure")
class SampleController{
    @GetMapping
    public String sample(){
        return "I'm unsecure";
    }
}