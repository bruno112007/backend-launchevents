package com.bruno.launchevents;

import com.bruno.launchevents.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.bruno.launchevents")
@Configuration
@EnableAutoConfiguration
public class CourseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseProjectApplication.class, args);
	}

}
