package com.testHeroku.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String greeting() {
        return "Hello,World!";
    }

    @GetMapping("/hello2")
    public String greeting2() {
        return "Hello,World 2!";
    }
}
