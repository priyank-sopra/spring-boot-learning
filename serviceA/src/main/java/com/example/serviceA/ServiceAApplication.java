package com.example.serviceA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
		System.out.println("application ServiceA Started.....");
	}
	
	@Bean
	RestTemplate createRestTemplate() {
        return new RestTemplate();
    }

}
