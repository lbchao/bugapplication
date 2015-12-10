package com.example.syl.mybugapplication.activity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.example.syl.mybugapplication.R;

/**
 * Created by lin on 2015/12/9.
 */
public class IssueOneHundrdAndThirdSevenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_137);
        initConfig();
    }

    private void initConfig(){
     String path=  Environment.getExternalStorageDirectory().getAbsolutePath();
//        File file=new File(path,"/test/testa.db");
//        if(file.exists()){
//            Log.i("result:","exists");
//            file.delete();
//        }
//        else {
//            file.mkdirs();
//        }
              SQLiteDatabase database=SQLiteDatabase.openOrCreateDatabase(path+"/test/testa.db",null);
    }
}
