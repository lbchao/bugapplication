package com.example.syl.mybugapplication.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.syl.mybugapplication.R;
import com.example.syl.mybugapplication.widget.BuglyOOMAdapter;
import com.example.syl.mybugapplication.widget.BuglyOOMEntity;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 118
 * Created by lin on 2015/12/7.
 */
public class IssueOneHundredAndEighteenActivity extends AppCompatActivity {


    @Bind(R.id.list_view)
    ListView mListView;


    private BuglyOOMAdapter mAdapter;

    private ArrayList<BuglyOOMEntity> mList;
    private BuglyOOMEntity mEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_118);
        ButterKnife.bind(this);
        initData();

    }

    private void init(){

    }

    private void initData() {
        mList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            mEntity = new BuglyOOMEntity();
            mEntity.setName(i + "name");
            Bitmap btp = BitmapFactory.decodeResource(this.getResources(),
                    R.drawable.icon_bugly_oom_bg);
//            InputStream is = this.getResources().openRawResource(R.raw.icon_bugly_three_bg);
//            BitmapFactory.Options options=new BitmapFactory.Options();
//            options.inPreferredConfig = Bitmap.Config.RGB_565;
//            options.inPurgeable = true;
//            options.inInputShareable = true;
//            options.inJustDecodeBounds = false;
////width,hight设为原来的十分一
//            options.inSampleSize = 10;
//            Bitmap btp =BitmapFactory.decodeStream(is,null,options);
            mEntity.setBitmap(btp);
            mList.add(mEntity);
        }
        mAdapter = new BuglyOOMAdapter(this, mList);
        mListView.setAdapter(mAdapter);
    }

}
