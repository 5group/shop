package com.shop.item;

import com.shop.dto.Item;
import com.shop.service.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class SelectTests {

	@Inject
	ItemService service;

	@DisplayName("SELECT")
	@Test
	void contextLoads() {
		Item item = null;
		
		try {
			item = service.get(5);
			System.out.println(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	