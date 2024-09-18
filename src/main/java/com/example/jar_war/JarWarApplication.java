package com.example.jar_war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JarWarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JarWarApplication.class, args);
	}

	@GetMapping("/jar")
	public String  greeting(){
		return "greetings from jar file";
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JarWarApplication.class);
	}

}
