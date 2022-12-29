package com.shop.cart;

import com.shop.dto.Cart;
import com.shop.service.CartService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SelectTests {
    @Autowired
    CartService service;

    @DisplayName("Select")
    @Test
    void contextLoads(){
        Cart obj=null;

        try{
            obj=service.get(5);
            System.out.println(obj);
            System.out.println("OK");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");

        }
    }
}
