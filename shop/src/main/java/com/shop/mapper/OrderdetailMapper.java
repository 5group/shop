package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Orderdetail;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface OrderdetailMapper extends MyMapper<Integer, Orderdetail>{

}
