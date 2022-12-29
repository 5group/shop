package com.shop.cart;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
public class SelectAllTests {
    @Autowired
    CartService service;

    @DisplayName("SelectAll")
    @Test
    void contextLoads(){
        List<Cart> objs=null;

        try{
            objs=service.get();
            for(Cart c:objs) {
            	System.out.println(c);
            }
            System.out.println("OK");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");

        }
    }
}
