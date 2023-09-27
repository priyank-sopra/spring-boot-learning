package com.example.restClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
		System.out.println("rest client app started.....");
	}

//	we are injecting the getRestTemplate() function into our application as a Bean.
    @Bean
    @LoadBalanced
    RestTemplate createRestTemplate() {
        return new RestTemplate();
    }

}
