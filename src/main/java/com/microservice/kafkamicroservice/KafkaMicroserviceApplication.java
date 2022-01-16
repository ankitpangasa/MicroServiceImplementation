package com.microservice.kafkamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaMicroserviceApplication {

	@GetMapping("/message")
	public String getmessage() {
		return "This is just the test !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaMicroserviceApplication.class, args);
	}

}
