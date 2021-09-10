package com.example.dockerimage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class rest {
    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
       return "hello "+name;
    }
}
