package com.management.doc.binder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DocApplication {
	public static void main(String[] args) {
		SpringApplication.run(DocApplication.class, args);
	}
}
