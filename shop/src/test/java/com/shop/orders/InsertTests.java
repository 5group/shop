package com.shop.orders;


import com.shop.dto.Orders;
import com.shop.service.OrdersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertTests {
    @Autowired
    OrdersService service;

    @Test
    void contextLoads(){
        Orders orders = new Orders(2, 1, "OO카드", null);

        try{
            service.register(orders);
            System.out.println("Ok");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("fail");
            System.out.println("fail2");
            
        }
    }

}
