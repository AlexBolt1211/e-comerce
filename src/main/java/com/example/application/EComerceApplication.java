package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class EComerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EComerceApplication.class, args);
	}

}
