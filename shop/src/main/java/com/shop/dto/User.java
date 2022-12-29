package com.shop.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private int user_no;
    private String user_id;
    private String user_pwd;
    private String user_name;
    private String user_email;
    private String user_phone_number;
    private Date user_rdate;
    
    
    private String item_name;
    private int price;
    private int count;
    private int total;

    public User(int user_no, String user_id, String user_pwd, String user_name){
        this.user_no = user_no;
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.user_name = user_name;
    }
    
    
    public User(String user_id, String user_name, String item_name, int price, int count, int total) {
    	this.user_id=user_id;
    	this.user_id=user_name;
    	this.price=price;
    	this.count=count;
    	this.total=total;
    }
}
