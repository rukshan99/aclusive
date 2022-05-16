package com.aclusive.recommenderengineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableJpaRepositories
public class RecommenderEngineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommenderEngineServiceApplication.class, args);
	}

}
