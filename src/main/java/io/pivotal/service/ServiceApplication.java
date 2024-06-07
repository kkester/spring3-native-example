package io.pivotal.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@RestController
	public class HelloController {
		@GetMapping("/hello")
		public String hello() {
			return "hello !!!!!";
		}
		@GetMapping("/hello2")
		public String hello2() {
			return "hello2 !!!!!";
		}
	}

}
