package com.javabootcamp.crshop;

import com.javabootcamp.crshop.basket.Basket;
import com.javabootcamp.crshop.basket.BasketRepository;
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
	@Autowired
	private BasketRepository basketRepository;

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

		Product product2 = new Product();
		product2.setName("product002");
		product2.setDescription("product002 description");
		product2.setPrice(150F);
		product2.setQuantity(10);
		productRepository.save(product2);
	}

	@PostConstruct
	public void addBasket(){
		User user = new User();
		user.setName("pom");
		user.setEmail("test@gmail.com");
		user.setUsername("pom");
		user.setDistrict("บางแค");
		user.setProvince("กรุงเทพมหานคร");
		userRepository.save(user);

		System.out.println("User id : "+user.getId());

		Product product = new Product();
		product.setName("product001");
		product.setDescription("product001 description");
		product.setPrice(200F);
		product.setQuantity(10);
		productRepository.save(product);

		Product product2 = new Product();
		product2.setName("product002");
		product2.setDescription("product002 description");
		product2.setPrice(150F);
		product2.setQuantity(10);
		productRepository.save(product2);

		Basket basket = new Basket();
		basket.setAmount(1);
		basket.setPrice(product.getPrice());
		basket.setProductId(product.getId());
		basket.setUserId(user.getId());
		basketRepository.save(basket);

		Basket basket2 = new Basket();
		basket2.setAmount(1);
		basket2.setPrice(product2.getPrice());
		basket2.setProductId(product2.getId());
		basket2.setUserId(user.getId());
		basketRepository.save(basket2);
	}

	public static void main(String[] args) {
		SpringApplication.run(CrshopApplication.class, args);
	}

}
