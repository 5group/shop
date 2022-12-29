package com.shop.item;

import com.shop.dto.Item;
import com.shop.service.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;
import java.util.List;

@SpringBootTest
class PriceSortAscSelectAllTests {

	@Inject
	ItemService service;

	@DisplayName("SORT_SELECT_ALL")
	@Test
	void contextLoads() {
		List<Item> list = null;
		try {
			list = service.PriceSortAscSelectAll();
			for(Item item  : list) System.out.println(item);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	