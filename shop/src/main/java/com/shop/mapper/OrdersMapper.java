package com.shop.mapper;

import com.shop.dto.Orders;
import com.shop.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrdersMapper extends MyMapper<Integer, Orders>{
}
