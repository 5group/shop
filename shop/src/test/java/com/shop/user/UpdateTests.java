package com.shop.user;

import com.shop.dto.User;
import com.shop.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class UpdateTests {

	@Inject
	UserService service;
	
	@DisplayName("UPDATE")
	@Test
	void contextLoads() {
		User user = new User();
		user.setUser_no(100);
		user.setUser_id("501");
		user.setUser_pwd("201");
		user.setUser_name("응애");
		try {
			service.modify(user);
			System.out.println(user.getUser_id()+"번 제품 수정 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	