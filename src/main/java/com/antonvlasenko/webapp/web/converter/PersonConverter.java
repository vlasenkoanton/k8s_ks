package com.antonvlasenko.webapp.web.converter;

import com.antonvlasenko.webapp.jpa.entity.PersonEntity;
import com.antonvlasenko.webapp.web.dto.PersonDto;

import java.util.List;
import java.util.stream.Collectors;

public class PersonConverter {
    private PersonConverter() {
    }

    public static List<PersonDto> toDtos(List<PersonEntity> entities) {
        return entities
                .stream()
                .map(PersonConverter::toDto)
                .collect(Collectors.toList());
    }

    public static PersonDto toDto(PersonEntity entity) {
        PersonDto dto = new PersonDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        return dto;
    }

    public static PersonEntity toEntity(PersonDto dto) {
        PersonEntity entity = new PersonEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        return entity;
    }
}
