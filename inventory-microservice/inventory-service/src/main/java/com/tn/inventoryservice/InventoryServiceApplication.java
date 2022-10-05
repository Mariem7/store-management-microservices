package com.tn.inventoryservice;

import com.tn.inventoryservice.entities.Product;
import com.tn.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product(null,"pc", 1500,100));
			productRepository.save(new Product(null,"tv", 1800,500));
			productRepository.save(new Product(null,"phone", 780,100));
			productRepository.findAll().forEach(p-> System.out.println(p.toString()));
		};
	}

	 */


}
