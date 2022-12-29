package com.shop.item;

import com.shop.service.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class DeleteTests {

	@Inject
	ItemService service;
	@DisplayName("DELETE")
	@Test
	void contextLoads() {
		try {
			service.remove(8);
			System.out.println("상품 삭제 완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	