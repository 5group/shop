package com.shop.cart;

import com.shop.dto.Cart;
import com.shop.service.CartService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertTests {
    @Autowired
    CartService service;

    @DisplayName("INSERT")
    @Test
    void contextLoads(){
        Cart cart = new Cart(555, 16, 1);

        try{
            service.register(cart);
            System.out.println("OK");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");

        }
    }
}
