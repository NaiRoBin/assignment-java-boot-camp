package com.javabootcamp.crshop;

import com.javabootcamp.crshop.product.Product;
import com.javabootcamp.crshop.product.ProductRepository;
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
	@Autowired
	private ProductRepository productRepository;

	public CrshopApplication() {
	}

	@PostConstruct
	public void addUser() {
		User user = new User();
		user.setName("pom");
		user.setEmail("test@gmail.com");
		user.setUsername("pom");
		user.setAddress("99/99");
		user.setPhone("091-234-5678");
		user.setDistrict("บางแค");
		user.setProvince("กรุงเทพมหานคร");
		user.setZipcode("10160");
		userRepository.save(user);
	}

	@PostConstruct
	public void addProduct(){
		Product product = new Product();
		product.setName("product001");
		product.setDescription("product001 description");
		product.setPrice(200F);
		product.setQuantity(10);
		productRepository.save(product);
	}

	public static void main(String[] args) {
		SpringApplication.run(CrshopApplication.class, args);
	}

}
