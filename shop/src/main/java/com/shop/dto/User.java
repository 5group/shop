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

    public User(int user_no, String user_id, String user_pwd, String user_name){
        this.user_no = user_no;
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.user_name = user_name;
    }
}
