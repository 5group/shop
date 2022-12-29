package com.shop.item;

import com.shop.dto.Item;
import com.shop.service.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;
import java.util.List;

@SpringBootTest
class SelectAllTests {

	@Inject
	ItemService service;

	@DisplayName("SELECT_ALL")
	@Test
	void contextLoads() {
		List<Item> list = null;
		try {
			list = service.get();
			for(Item item  : list) System.out.println(item);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	