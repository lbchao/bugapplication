package com.example.syl.mybugapplication.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.syl.mybugapplication.R;
import com.example.syl.mybugapplication.entity.CastEntity;
import com.example.syl.mybugapplication.inf.CastInterface;

/**
 * Created by lin on 2015/12/6.
 */
public class IssueOneHundredAndFourActivity extends AppCompatActivity {


  private SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_104);
        initError();
        initRight();
    }


    private void initError() {
        CastEntity entity=new CastEntity();
//        if(entity instanceof  CastInterface){
//
//        }
        CastInterface castInterface=(CastInterface)entity;
    }

    private void initRight() {
  //      CastTwoEntity entity=new CastTwoEntity();
  //      CastInterface castInterface=entity;
    }

    private  void initCurrentError(){
    //    getSharedPreferences("",MODE_PRIVATE);
    }




}
