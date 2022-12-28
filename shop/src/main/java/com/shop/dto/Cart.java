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

    public Cart(int cart_no, int user_no, int item_no){
        this.cart_no = cart_no;
        this.user_no = user_no;
        this.item_no = item_no;
    }
}
