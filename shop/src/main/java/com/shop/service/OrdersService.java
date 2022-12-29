package com.shop.service;

import com.shop.dto.Orders;
import com.shop.frame.MyService;
import com.shop.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements MyService<Integer, Orders> {
    @Autowired
    OrdersMapper mapper;

    @Override
    public void register(Orders v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
    }

    @Override
    public void modify(Orders v) throws Exception {
        mapper.insert(v);
    }

    @Override
    public Orders get(Integer k) throws Exception {
        return mapper.select(k);
    }

    @Override
    public List<Orders> get() throws Exception {
        return mapper.selectall();
    }


}
