package com.example.demo.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



    @RequestMapping("/test")
    public String test(){
        return "Hello word!!!";
    }
}
