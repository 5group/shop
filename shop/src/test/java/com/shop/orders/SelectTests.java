package com.shop.orders;

import com.shop.dto.Item;
import com.shop.dto.Orders;
import com.shop.service.ItemService;
import com.shop.service.OrdersService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class SelectTests {

	@Inject
	OrdersService service;

	@DisplayName("SELECT")
	@Test
	void contextLoads() {
		Orders orders = null;
		
		try {
			orders = service.get(5);
			System.out.println(orders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	