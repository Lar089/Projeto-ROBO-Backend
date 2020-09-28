package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan
@SpringBootApplication
public class ProjetoApplication {
	
	@GetMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

}
