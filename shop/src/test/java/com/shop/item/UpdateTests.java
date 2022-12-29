package com.shop.item;

import com.shop.dto.Item;
import com.shop.service.ItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest
class UpdateTests {

	@Inject
	ItemService service;

	@DisplayName("UPDATE")
	@Test
	void contextLoads() {
		Item item = new Item();
		item.setItem_no(8);
		item.setCate_no(33);
		item.setItem_name("아이폰33");
		item.setPrice(10000000);
		try {
			service.modify(item);
			System.out.println(item.getItem_no()+"번 제품 수정 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	