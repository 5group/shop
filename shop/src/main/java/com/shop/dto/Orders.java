package com.shop.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Orders {
    private int order_no;
    private int user_no;
    private String payment;
    private Date order_date;

    private int total;

    public Orders(int order_no, int user_no, String payment, Date order_date) {
        this.order_no = order_no;
        this.user_no = user_no;
        this.payment = payment;
        this.order_date = order_date;
    }
}
