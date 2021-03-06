package com.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ganesh.entity.User;
import com.ganesh.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		User entity = new User();
		
		entity.setUserId(105);
		entity.setUserName("ganesh");
		entity.setUserAge(31);
		entity.setUserPhno(7989094245l);
		
		entity.setUserCountry("India");
		
		userRepo.save(entity);
		System.out.println("RECORD INSERTED");
	}

}
