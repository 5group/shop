package com.shop.user;

import com.shop.dto.User;
import com.shop.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class InsertTests {

    @Autowired
    UserService service;

    @DisplayName("Insert Testing")
    @Test
    void contextLoads(){
        User user = new User(10, "1234", "1234", "조민수");
        try {
            service.register(user);
            System.out.println("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Fail");
        }
    }
}
