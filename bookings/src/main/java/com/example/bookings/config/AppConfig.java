package com.example.bookings.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datastax.oss.driver.api.core.CqlSession;
import com.example.bookings.validator.ContValidator;
import com.example.bookings.validator.ContainerValidator;

@Configuration
@ConfigurationProperties
public class AppConfig {

	@Bean
	public CqlSession session() {
		return CqlSession.builder().withKeyspace("maersk").build();
	}
	
	@Bean
	public ContainerValidator containerValidator() {
	    return new ContainerValidator();
	}
	
	@Bean
	public ContValidator contValidator() {
	    return new ContValidator();
	}
}
