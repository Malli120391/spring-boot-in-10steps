package com.malli.sprinboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIn10stepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationcontect 
		=SpringApplication.run(SpringBootIn10stepsApplication.class, args);
		
		for (String name : applicationcontect.getBeanDefinitionNames()) {
			
			System.out.println(name);
			
		}
	}

}
