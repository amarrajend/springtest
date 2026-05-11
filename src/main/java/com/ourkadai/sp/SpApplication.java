package com.ourkadai.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpApplication {

	@GetMapping("/")
	public String hello() {
		return "Hello World from GitHub! - Ravi ,Sat and Amarnath";
	}
	public static void main(String[] args) throws Exception {

		SpringApplication.run(SpApplication.class, args);
	}

}
