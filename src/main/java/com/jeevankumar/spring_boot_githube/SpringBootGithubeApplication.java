package com.jeevankumar.spring_boot_githube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGithubeApplication {

	@GetMapping(value = "/hello")
	public String hello(){
		return "Hello World....Application....";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubeApplication.class, args);
	}

}
