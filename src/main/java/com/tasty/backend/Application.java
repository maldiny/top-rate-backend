package com.tasty.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;	
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = { "com.tasty.backend.model" })
@EnableJpaRepositories(basePackages = { "com.tasty.backend.repository" })
@ComponentScan(basePackages={"com.tasty.backend.controlers"})
public class Application {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello Rus. App is deployed!<a href='./users'>Users.</a>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
