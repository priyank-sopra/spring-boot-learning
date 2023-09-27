package com.example.webClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.webClient.dao.Employee;

import jakarta.annotation.PostConstruct;
import reactor.core.publisher.Flux;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@RestController
@RequestMapping("/client")
@EnableZipkinServer
public class WebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
	}
	
	WebClient webclient;
	
	@PostConstruct
	public void init() {
		webclient = WebClient.builder().baseUrl("http://localhost:8080/home")
						.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}
	
	@GetMapping("/test")
	public Flux<Employee> getTheMappingFromHomeController(){
		return webclient.get().uri("/one").retrieve().bodyToFlux(Employee.class);
	}
	

}
