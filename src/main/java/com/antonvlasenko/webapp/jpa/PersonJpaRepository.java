package com.antonvlasenko.webapp.jpa;

import com.antonvlasenko.webapp.jpa.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<PersonEntity, Integer> {
}
