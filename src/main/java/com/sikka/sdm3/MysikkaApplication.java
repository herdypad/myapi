package com.sikka.sdm3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.sikka.sdm3.config.FileStorageProperties;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@EnableJpaAuditing
@SpringBootApplication()
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class MysikkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysikkaApplication.class, args);
	}

}
