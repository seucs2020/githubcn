package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("vaccine")
@Data
public class User {
    @TableId(type = IdType.AUTO)
    private String id;
    private String type;
    private String time;
    private String address;
    private String currentp;
    private String totalp;

}