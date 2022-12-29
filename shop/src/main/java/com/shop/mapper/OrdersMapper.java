package com.shop.mapper;

import com.shop.dto.Orders;
import com.shop.dto.User;
import com.shop.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrdersMapper extends MyMapper<Integer, Orders>{
    public List<Orders> selectPriceAll() throws Exception;
}
