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
}
