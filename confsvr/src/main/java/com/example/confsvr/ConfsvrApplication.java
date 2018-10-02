package com.example.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class ConfsvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfsvrApplication.class, args);
	}
}
