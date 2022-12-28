package com.shop.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private int no;
    private String id;
    private String pwd;
    private String name;
    private String email;
    private String number;
    private Date rdate;

    public User(int no, String id, String pwd, String name){
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }
}
