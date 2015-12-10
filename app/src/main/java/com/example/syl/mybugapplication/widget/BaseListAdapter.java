package com.example.syl.mybugapplication.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by syl on 2015/11/9.
 */
public class BaseListAdapter<T> extends BaseAdapter {

    public static final int ZERO = 0B0000;
    protected ArrayList<T> mList;
    protected Context mContext;
    protected LayoutInflater mInflater;

    public BaseListAdapter(Context context, ArrayList<T> list) {
        this.mContext = context;
        this.mList = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return (mList != null ? mList.size() : ZERO);
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return convertView;
    }
}
