package com.toolmarket.toolmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ToolmarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToolmarketApplication.class, args);
	}

}
