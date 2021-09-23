package com.naughty.userlogin02.bean;


import lombok.Data;

@Data
public class Goods {
    private int id;
    private String code;
    private String identificationCode;
    private String name;
    private String distributors;
    private float purchasingPrice;
    private float sellingPrice;


}
