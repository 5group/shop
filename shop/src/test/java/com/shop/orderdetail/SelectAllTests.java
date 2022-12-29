package com.shop.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdetail;
import com.shop.service.OrderdetailService;


@SpringBootTest
class SelectAllTests {

	@Autowired
	OrderdetailService service;
	
	@Test
	void contextLoads() {
		Orderdetail detail = null;
		try {
			detail = service.get(1);
			System.out.println(detail);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}