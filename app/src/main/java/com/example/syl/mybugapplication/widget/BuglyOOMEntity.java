package com.example.syl.mybugapplication.widget;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by syl on 2015/12/7.
 */
public class BuglyOOMEntity implements Serializable{

    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String  url;

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }

    private Bitmap  mBitmap;


}
