package com.shop.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdetail;
import com.shop.service.OrderdetailService;


@SpringBootTest
class UpdateTests {

	@Autowired
	OrderdetailService service;
	
	@Test
	void contextLoads() {
		Orderdetail detail = new Orderdetail(3, 3, 1, 2, "오전배송");
		try {
			service.register(detail);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}