package com.antonvlasenko.webapp.web;

import com.antonvlasenko.webapp.jpa.PersonJpaRepository;
import com.antonvlasenko.webapp.web.dto.PersonDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.antonvlasenko.webapp.web.converter.PersonConverter.toDtos;
import static com.antonvlasenko.webapp.web.converter.PersonConverter.toEntity;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonJpaRepository repository;

    public PersonController(PersonJpaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PersonDto> getAll() {
        return toDtos(repository.findAll());
    }

    @PostMapping
    public void create(@RequestBody PersonDto dto) {
        repository.save(toEntity(dto));
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
