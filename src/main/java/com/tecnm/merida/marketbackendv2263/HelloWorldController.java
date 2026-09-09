package com.tecnm.merida.marketbackendv2263;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/saludar")
public class HelloWorldController {


    @GetMapping("/saludo")
    public String helloWorld() {
        return "Hello World!";
    }
}