package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerQ1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerQ1Application.class, args);
	}
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello. This is Assignment 4. Welcome To Docker Application! Let's get started.";
	}

}
