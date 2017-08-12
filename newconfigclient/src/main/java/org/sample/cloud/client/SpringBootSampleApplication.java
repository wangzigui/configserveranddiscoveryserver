package org.sample.cloud.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SpringBootSampleApplication{

	@Value("${server.port}")
	private int port;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}


	
}
