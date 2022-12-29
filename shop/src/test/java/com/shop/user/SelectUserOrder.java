package com.shop.user;

import com.shop.dto.User;
import com.shop.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;
import java.util.List;

@SpringBootTest
class SelectUserOrder {

	@Inject
	UserService service;

	@DisplayName("SELECTUserOrder")
	@Test
	void contextLoads() {
		List<User> list = null;
		try {
			list = service.getOrder("aaa");
			for(User user  : list) System.out.println(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	