package com.shop.user;

import com.shop.dto.User;
import com.shop.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class SelectTests {

	@Inject
	UserService service;
	
	@DisplayName("SELECT")
	@Test
	void contextLoads() {
		User user = null;
		
		try {
			user = service.get(1);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	