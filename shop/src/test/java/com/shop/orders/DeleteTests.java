package com.shop.orders;

import com.shop.service.OrdersService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class DeleteTests {

	@Inject
	OrdersService service;
	@DisplayName("DELETE")
	@Test
	void contextLoads() {
		try {
			service.remove(4);
			System.out.println("상품 삭제 완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	