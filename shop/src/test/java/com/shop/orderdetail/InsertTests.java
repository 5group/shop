package com.shop.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdetail;
import com.shop.service.OrderdetailService;


@SpringBootTest
class InsertTests {

	@Autowired
	OrderdetailService service;
	
	@Test
	void contextLoads() {
		Orderdetail detail = new Orderdetail(3, 4, 1, 4, "새벽배송");
		try {
			service.register(detail);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}