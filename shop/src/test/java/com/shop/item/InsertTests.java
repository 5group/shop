package com.shop.item;


import com.shop.dto.Item;
import com.shop.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertTests {
    @Autowired
    ItemService service;

    @Test
    void contextLoads(){
        Item item = new Item(6, 33, "iphone 14", 905050);

        try{
            service.register(item);
            System.out.println("Ok");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("fail");
        }
    }

}
