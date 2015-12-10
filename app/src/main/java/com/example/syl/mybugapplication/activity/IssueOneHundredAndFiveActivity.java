package com.example.syl.mybugapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.syl.mybugapplication.R;
import com.example.syl.mybugapplication.entity.NullEntity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lin on 2015/12/6.
 */
public class IssueOneHundredAndFiveActivity extends AppCompatActivity {


    @Bind(R.id.text_view_start)
    TextView mTextViewStart;
//    @Bind(R.id.text_view_result)
    TextView mTextViewResult;

    private NullEntity mNullEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_105);
        ButterKnife.bind(this);
        initConfig();
    }

    private void initConfig() {

    }

    @OnClick(R.id.text_view_start)
    public void  errorOperation(){
        mTextViewResult.setText("");
    }
}
