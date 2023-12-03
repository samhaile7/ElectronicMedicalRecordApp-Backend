package com.samuelhaile.emrapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmrApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/");

		SpringApplication.run(EmrApplication.class, args);
	}

}
