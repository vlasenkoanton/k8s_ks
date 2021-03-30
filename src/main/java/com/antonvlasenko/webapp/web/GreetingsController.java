package com.antonvlasenko.webapp.web;

import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GreetingsController {

    private final BuildProperties buildProperties;

    public GreetingsController(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping
    public String greeting(Model model) {
        String version = buildProperties.getVersion();
        model.addAttribute("version", version);
        return "greeting";
    }
}
