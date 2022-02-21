package com.javabootcamp.crshop;

import com.javabootcamp.crshop.users.User;
import com.javabootcamp.crshop.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CrshopApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void addUser() {
		User user = new User();
		user.setName("pom");
		//user.setId(1L);
		user.setEmail("test@gmail.com");
		user.setUsername("pom");
		user.setAddress("99/99");
		user.setPhone("091-234-5678");
		user.setDistrict("บางแค");
		user.setProvince("กรุงเทพมหานคร");
		user.setZipcode("10160");
		userRepository.save(user);
	}

	public static void main(String[] args) {
		SpringApplication.run(CrshopApplication.class, args);
	}

}
