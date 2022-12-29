package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Item;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface ItemMapper extends MyMapper<Integer, Item> {
	public List<Item> PriceSortDescSelectAll() throws Exception;
	public List<Item> PriceSortAscSelectAll() throws Exception;

}
