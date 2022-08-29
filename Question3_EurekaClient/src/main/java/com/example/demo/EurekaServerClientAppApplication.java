package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaServerClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerClientAppApplication.class, args);
		System.out.println("Server started");
	}
	 @GetMapping

	 public String hi() {

	 return " This is Eureka Client Application.Let's get started !";

	 }

}


//http://localhost:8080