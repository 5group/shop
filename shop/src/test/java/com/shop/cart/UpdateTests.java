package com.shop.cart;

import com.shop.dto.Cart;
import com.shop.service.CartService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UpdateTests {
    @Autowired
    CartService service;

    @DisplayName("Update")
    @Test
    void contextLoads(){
    	Cart obj=new Cart(5, 8);
        try{
            service.modify(obj);
            System.out.println("OK");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");

        }
    }
}
