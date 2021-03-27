package com.antonvlasenko.webapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/logs")
public class LogsController {

    @GetMapping
    public void generateLogs() {
        log.info("Hello from LogsController!!!");
    }
}
