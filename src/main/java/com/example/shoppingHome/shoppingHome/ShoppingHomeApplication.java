package com.example.shoppingHome.shoppingHome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EntityScan(basePackages = {"com.example.shoppingHome.shoppingHome.entities"})
@EnableScheduling
@SpringBootApplication
public class ShoppingHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingHomeApplication.class, args);
	}
}
