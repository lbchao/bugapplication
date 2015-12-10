package com.example.syl.mybugapplication.entity;

import com.example.syl.mybugapplication.inf.CastInterface;

/**
 * Created by lin on 2015/12/6.
 */
public class CastTwoEntity implements CastInterface{

    private String name;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String desc;


}
