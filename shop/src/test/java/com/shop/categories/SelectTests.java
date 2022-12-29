package com.shop.categories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Categories;
import com.shop.dto.Orderdetail;
import com.shop.service.CategoriesService;

@SpringBootTest
class SelectTests {

	@Autowired
	CategoriesService service;
	
	@Test
	void contextLoads() {
		List<Categories> cate = null;
		try {
			cate = service.get();
			for(Categories c:cate) {
				System.out.println(c);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}