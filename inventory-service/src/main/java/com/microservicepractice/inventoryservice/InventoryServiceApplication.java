package com.microservicepractice.inventoryservice;

import com.microservicepractice.inventoryservice.model.Inventory;
import com.microservicepractice.inventoryservice.repository.InventoryRepository;
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
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_13");
			inventory.setQuantity(1100);
			inventoryRepository.save(inventory);
			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_13_blue");
			inventory1.setQuantity(112100);
			inventoryRepository.save(inventory1);
			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("iphone_13_Green");
			inventory2.setQuantity(1200);
			inventoryRepository.save(inventory2);
			Inventory inventory13 = new Inventory();
			inventory13.setSkuCode("iphone_13_Yellow");
			inventory13.setQuantity(1200);
			inventoryRepository.save(inventory13);

		};
	}

}
