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


}
