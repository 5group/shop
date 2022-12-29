package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Orderdetail {
	private int orderdatail_no;
	private int item_no;
	private int order_no;
	private int count;
	private String request;
	
	public Orderdetail(int orderdatail_no, int item_no, int order_no, int count) {
		this.orderdatail_no = orderdatail_no;
		this.item_no = item_no;
		this.order_no = order_no;
		this.count = count;
	}
	
	
}
