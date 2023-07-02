package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/docker")
    public String holamundo() {
        return "Hola mundo desde docker";
    }
}
