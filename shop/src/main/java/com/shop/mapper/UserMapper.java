package com.shop.mapper;

import com.shop.dto.User;
import com.shop.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends MyMapper<String, User> {

}
