package org.sample.cloud.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootSampleApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
	
	
}
