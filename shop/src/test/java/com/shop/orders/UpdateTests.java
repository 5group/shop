package com.shop.orders;

import com.shop.dto.Orders;
import com.shop.service.OrdersService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class UpdateTests {

	@Inject
	OrdersService service;

	@DisplayName("UPDATE")
	@Test
	void contextLoads() {
		Orders orders = new Orders();
		orders.setOrder_no(5);
		orders.setUser_no(4);
		orders.setPayment("ㅁㅁ카드");
		orders.setOrder_date(null);
		try {
			service.modify(orders);
			System.out.println(orders.getOrder_no()+"번 제품 수정 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	