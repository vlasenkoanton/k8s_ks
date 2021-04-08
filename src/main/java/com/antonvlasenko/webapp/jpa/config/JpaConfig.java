package com.antonvlasenko.webapp.jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.antonvlasenko.webapp.jpa")
public class JpaConfig {
}
