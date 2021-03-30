package com.antonvlasenko.webapp.jpa.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@Getter @Setter
@EqualsAndHashCode(of = "id")
public class PersonEntity {
    @Id
    private Integer id;
    private String name;
    private Integer age;
}
