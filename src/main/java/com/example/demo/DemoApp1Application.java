package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApp1Application {
	@GetMapping("/")
	public String check(){
		return "This is spring boot application";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApp1Application.class, args);
	}

}
