package com.sssm.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBasicApplication.class, args);
		System.out.println("I am running!");
	}
}
