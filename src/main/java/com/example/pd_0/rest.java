package com.example.pd_0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {
    @GetMapping("/hallo")
    public String returnHello(){
        return "hello";
    }

}
