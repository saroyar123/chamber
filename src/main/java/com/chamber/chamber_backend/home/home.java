package com.chamber.chamber_backend.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class home {

    @GetMapping("/")
    public String hello()
    {
        return "hello to spring boot";
    }


}
