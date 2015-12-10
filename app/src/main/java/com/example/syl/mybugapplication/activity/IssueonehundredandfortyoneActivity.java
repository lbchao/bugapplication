package com.example.syl.mybugapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.syl.mybugapplication.R;
import com.example.syl.mybugapplication.widget.Rdatabase;

/**issue 141
 * Created by lin on 2015/12/9.
 */
public class IssueonehundredandfortyoneActivity extends AppCompatActivity {

//    private SqliteHelper mHelper;
    private Rdatabase db;
//
//    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_141);
    }

    private void initConfig(){
        db=Rdatabase.getDatabaseInstance(this);
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugsDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugsDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugsDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugsDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugsDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugsDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
        new Thread(new bugDb()).start();
    }

    private  class  bugDb  implements Runnable{
        @Override
        public void run() {
           // db=Rdatabase.getDatabaseInstance(IssueonehundredandfortyoneActivity.this);
//            synchronized (db){
                db=Rdatabase.getDatabaseInstance(IssueonehundredandfortyoneActivity.this);
                db.insertPost("a","b","c");
//            }
          //  db.insertPost("a","b","c");
        }
    }


    private  class  bugsDb  implements Runnable{
        @Override
        public void run() {
            // db=Rdatabase.getDatabaseInstance(IssueonehundredandfortyoneActivity.this);
//            synchronized (db){
            db=Rdatabase.getDatabaseInstance(IssueonehundredandfortyoneActivity.this);
            db.search();
//            }
            //  db.insertPost("a","b","c");
        }
    }


}
