package com.jeevankumar.spring_boot_githube;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/api/v1")
public class SpringBootGithubeApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringBootGithubeApplication.class);

	@GetMapping(value = "/hello")
	public String hello(){
		logger.info("This is log message");
		return "Hello World....Application....";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubeApplication.class, args);
	}

}
