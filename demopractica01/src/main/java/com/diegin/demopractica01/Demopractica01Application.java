package com.diegin.demopractica01;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.diegin.repository")
@ComponentScan({"com.diegin.controller","com.diegin.service"})
@EntityScan("com.diegin.modell")
public class Demopractica01Application {

	public static void main(String[] args) {
		SpringApplication.run(Demopractica01Application.class, args);
	}
}
