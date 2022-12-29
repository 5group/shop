package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.User;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface UserMapper extends MyMapper<Integer, User> {
	public List<User> selectUserOrder(String user_id) throws Exception;
	public List<User> selectUserTotalPrice(String user_id) throws Exception;
}
