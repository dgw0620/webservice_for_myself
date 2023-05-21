package com.springboot.webservice_for_myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
public class WebserviceForMyselfApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebserviceForMyselfApplication.class, args);
	}
}
