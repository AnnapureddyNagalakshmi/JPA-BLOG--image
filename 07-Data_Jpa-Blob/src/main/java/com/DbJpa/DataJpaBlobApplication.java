package com.DbJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.service.UserService;

@SpringBootApplication
public class DataJpaBlobApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context= SpringApplication.run(DataJpaBlobApplication.class, args);
		UserService service=context.getBean(UserService.class);
		service.saveData();
	}

}
		