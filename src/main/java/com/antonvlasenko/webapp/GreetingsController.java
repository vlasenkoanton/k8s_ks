package com.antonvlasenko.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingsController {

    @GetMapping
    public String hello() {
        return "Привет SPD-шники. Шо вы?";
    }
}
