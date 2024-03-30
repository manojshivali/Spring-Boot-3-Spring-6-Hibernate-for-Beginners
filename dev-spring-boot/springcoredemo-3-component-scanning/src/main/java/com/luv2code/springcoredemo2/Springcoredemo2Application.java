package com.luv2code.springcoredemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {"com.luv2code.springcoredemo2",
				            "com.luv2code.util"}
)
*/
@SpringBootApplication
public class Springcoredemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcoredemo2Application.class, args);
	}

}
