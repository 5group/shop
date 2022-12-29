package com.shop.orderdetail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdetail;
import com.shop.service.OrderdetailService;

@SpringBootTest
class SelectTests {

	@Autowired
	OrderdetailService service;
	
	@Test
	void contextLoads() {
		List<Orderdetail> detail = null;
		try {
			detail = service.get();
			for(Orderdetail d:detail) {
				System.out.println(d);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}