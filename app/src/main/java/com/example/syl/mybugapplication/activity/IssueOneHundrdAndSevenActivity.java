package com.example.syl.mybugapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.syl.mybugapplication.R;

/**
 * Created by lin on 2015/12/6.
 */
public class IssueOneHundrdAndSevenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_107);
        initBugOperation();
    }

    private void initBugOperation(){
        String[]array=new String[]{"0","1","2","3","4","5","6","7","8","9"};
        String[]dest=new String[15];
         System.arraycopy(array,0,dest,0,array.length+1);
    }
}
