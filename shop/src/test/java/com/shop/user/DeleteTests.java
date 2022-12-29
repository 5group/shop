package com.shop.user;

import com.shop.dto.User;
import com.shop.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class DeleteTests {

	@Inject
	UserService service;

	@DisplayName("DELETE")
	@Test
	void contextLoads() {
		try {
			service.remove(100);
			System.out.println("상품 삭제 완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	