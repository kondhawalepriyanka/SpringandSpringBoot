package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringStarterProjectApplication.class);
		SpringApplication.run(SpringStarterProjectApplication.class, args);
		//String str="Welcome to Spring REST";
		//System.out.println(str);
		//Using Spring IOC
		//Employee e=new Employee();
		//e.print();
		HelloController h=context.getBean(HelloController.class);
		System.out.println(h.display());
	}

}
