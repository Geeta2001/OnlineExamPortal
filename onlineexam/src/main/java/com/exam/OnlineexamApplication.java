package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.exam.controller","com.exam.model","com.exam.exception"})
@EnableJpaRepositories({"com.exam.model"})
@EntityScan("com.exam.model")
public class OnlineexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineexamApplication.class, args);
	}

}
