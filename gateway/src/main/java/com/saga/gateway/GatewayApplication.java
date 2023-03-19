package com.saga.gateway;

import java.io.Console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		System.out.println("GatewayApplication runnig");
		SpringApplication.run(GatewayApplication.class, args);
	}

}
