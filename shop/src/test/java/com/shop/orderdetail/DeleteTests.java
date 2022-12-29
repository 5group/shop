package com.shop.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.OrderdetailService;

@SpringBootTest
class DeleteTests {

	@Autowired
	OrderdetailService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(2);
			System.out.println("주문상세 삭제 완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}