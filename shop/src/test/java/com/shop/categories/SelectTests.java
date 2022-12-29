package com.shop.categories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Categories;
import com.shop.service.CategoriesService;


@SpringBootTest
class SelectTests {

	@Autowired
	CategoriesService service;
	
	@Test
	void contextLoads() {
		Categories cate = null;
		try {
			cate = service.get(32);
			System.out.println(cate);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}