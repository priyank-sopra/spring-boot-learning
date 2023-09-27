package com.ZIPKINEXAMPLE.ZIPKINEXAMPLE;

import java.lang.System.Logger.Level;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinexampleApplication.class, args);
		System.out.println("hello");


}

}