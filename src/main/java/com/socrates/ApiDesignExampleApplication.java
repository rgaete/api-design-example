package com.socrates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.socrates")
public class ApiDesignExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDesignExampleApplication.class, args);
	}
}
