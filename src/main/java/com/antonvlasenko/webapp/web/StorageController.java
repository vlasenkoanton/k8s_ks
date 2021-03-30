package com.antonvlasenko.webapp.web;

import com.antonvlasenko.webapp.web.dto.FileDto;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/storage")
public class StorageController {
    private static final String MOUNT_PATH = "/data";

    @PostMapping("write")
    public void writeFile(@RequestBody FileDto dto) throws IOException {
        Path path = Paths.get(MOUNT_PATH, dto.getName());
        Files.writeString(path, dto.getContent());
    }

    @GetMapping("read")
    public String readFile(@RequestParam String name) throws IOException {
        Path path = Paths.get(MOUNT_PATH, name);
        return Files.readString(path);
    }
}
