package com.example.syl.mybugapplication.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.syl.mybugapplication.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
/**
 * Created by syl on 2015/12/7.
 */
public class BuglyOOMAdapter extends BaseListAdapter<BuglyOOMEntity> {

    public BuglyOOMAdapter(Context context, ArrayList<BuglyOOMEntity> list) {
        super(context, list);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder=null;
//        if(convertView==null){
//            convertView = mInflater.inflate(R.layout.item_bugly_oom_adapter, null);
//        }
//        BuglyOOMEntity entity=getItem(position);
//
//        ImageView imageView= (ImageView) convertView.findViewById(R.id.image_view);
//        Bitmap  bitmap;
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
//        if(position%2==0){
//              bitmap= BitmapFactory.decodeResource(mContext.getResources(),R.drawable.icon_bugly_three_bg,options);
//        }
//        else {
//              bitmap= BitmapFactory.decodeResource(mContext.getResources(),R.drawable.icon_bugly_bg_two,options);
//        }
//        Drawable d = new BitmapDrawable(mContext.getResources(),bitmap);
//        imageView.setBackground(d);
    //    viewHolder=new ViewHolder(convertView);
    //    BuglyOOMEntity entity=getItem(position);
    //    viewHolder.mTextView.setText(entity.getName());
    //    viewHolder.mImageView.setBackgroundDrawable(mContext.getDrawable(R.drawable.icon_bugly_bg_two));
        ViewHolder viewHolder=null;
        if(convertView==null){
            convertView = mInflater.inflate(R.layout.item_bugly_oom_adapter, null);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        BuglyOOMEntity entity=getItem(position);
        viewHolder.mTextView.setText(entity.getName());
//        Bitmap  bitmap;
//        if(position%2==0){
//              bitmap= BitmapFactory.decodeResource(mContext.getResources(),R.drawable.icon_bugly_three_bg);
//        }
//        else {
//              bitmap= BitmapFactory.decodeResource(mContext.getResources(),R.drawable.icon_bugly_bg_two);
//        }
        Drawable d = new BitmapDrawable(mContext.getResources(),entity.getBitmap());
        viewHolder.mImageView.setBackground(d);
        return convertView;
    }


    static class ViewHolder {
        @Bind(R.id.text_view)
        TextView mTextView;
        @Bind(R.id.image_view)
        ImageView mImageView;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
