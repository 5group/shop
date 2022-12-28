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
    private String name;
    private String user_email;
    private String phone_number;
    private Date user_rdate;
}
