package com.example.learn_eureka_client_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LearnEurekaClientApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnEurekaClientApiGatewayApplication.class, args);
	}

}
