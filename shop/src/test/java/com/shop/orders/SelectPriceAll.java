package com.shop.orders;

import com.shop.dto.Orders;
import com.shop.service.OrdersService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;
import java.util.List;

@SpringBootTest
public class SelectPriceAll {
    @Inject
    OrdersService service;

    @DisplayName("SELECT_PRICE_ALL")
    @Test
    void contextLoads() {
        List<Orders> list = null;
        try {
            list = service.getPriceAll();
            for(Orders orders  : list) System.out.println(orders);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
