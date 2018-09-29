package com.sssm.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sssm.springbootbasic.model.ProgressTracker;

// @SpringBootApplication annotation indicates to Spring container - this is a stating point for Spring Boot Application.
@SpringBootApplication
public class SpringbootBasicApplication {

	public static void main(String[] args) {
		System.out.println("## Running SpringbootBasicApplication ##");
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootBasicApplication.class, args);
		// above line does following things -
		// 1. Sets up default configuration.
		// 2. Starts Spring application context.
		// 3. Performs class path scan.
		ProgressTracker pt = context.getBean(ProgressTracker.class);
		pt.showProgress();
	}
}
