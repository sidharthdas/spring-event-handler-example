package com.event.spring_event_handler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringEventHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventHandlerApplication.class, args);
	}

}
