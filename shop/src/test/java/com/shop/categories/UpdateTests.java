package com.shop.categories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Categories;
import com.shop.service.CategoriesService;


@SpringBootTest
class UpdateTests {

	@Autowired
	CategoriesService service;
	
	@Test
	void contextLoads() {
		Categories cate = new Categories(33, "세탁기", 30);
		try {
			service.modify(cate);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}