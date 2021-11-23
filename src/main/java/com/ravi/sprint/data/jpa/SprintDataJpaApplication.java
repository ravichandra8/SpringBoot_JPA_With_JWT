package com.ravi.sprint.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SprintDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintDataJpaApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return  new BCryptPasswordEncoder();
	}
}
