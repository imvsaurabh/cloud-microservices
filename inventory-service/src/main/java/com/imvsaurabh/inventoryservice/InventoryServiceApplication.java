package com.imvsaurabh.inventoryservice;

import com.imvsaurabh.inventoryservice.model.Inventory;
import com.imvsaurabh.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory iphone13 = new Inventory(null, "Iphone_13", 100);
			Inventory iphone_13_red = new Inventory(null, "Iphone_13_red", 0);

			inventoryRepository.save(iphone13);
			inventoryRepository.save(iphone_13_red);
		};
	}

}
