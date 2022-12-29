package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Orderdetail;
import com.shop.frame.MyService;
import com.shop.mapper.OrderdetailMapper;

@Service
public class OrderdetailService implements MyService<Integer, Orderdetail>{

	@Autowired
	OrderdetailMapper mapper;
	
	@Override
	public void register(Orderdetail v) throws Exception {
		mapper.insert(v);		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Orderdetail v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Orderdetail get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Orderdetail> get() throws Exception {
		return mapper.selectall();
	}

}
