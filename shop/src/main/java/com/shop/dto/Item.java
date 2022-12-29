package com.shop.dto;


import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Item {
    private int item_no;
    private int cate_no;
    private String item_name;
    private int price;
    private String des;
    private Date item_rdate;

    public Item(int item_no, int cate_no, String item_name, int price){
        this.item_no = item_no;
        this.cate_no = cate_no;
        this.item_name = item_name;
        this.price = price;
    }

}
