package com.shop.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cart {
    private int cart_no;
    private int user_no;
    private int item_no;
    private int quantity;
    private Date indate;

    private String user_id;
    private String user_name;
    private String item_name;
    private int price;
    private int total;
    
	public Cart(int user_no, int item_no, int quantity) {
		this.user_no = user_no;
		this.item_no = item_no;
		this.quantity = quantity;
	}
	
	public Cart(int cart_no, int quantity) {
		this.cart_no = cart_no;
		this.quantity = quantity;
	}
}
