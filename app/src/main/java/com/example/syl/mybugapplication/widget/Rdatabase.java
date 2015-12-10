package com.example.syl.mybugapplication.widget;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.syl.mybugapplication.SqliteHelper;

/**
 * Created by lin on 2015/12/9.
 */
public class Rdatabase {

    private static Rdatabase instance;

    private SQLiteDatabase db;
    private SqliteHelper dbHelper;

    private static final String createPostTableSql = "create table posts (" +
            "_id integer primary key autoincrement," +
            "title varchar," +
            "author varchar," +
            "link varchar," +
            "description varchar," +
            "date varchar)";

    public Rdatabase(Context c) {
      //  dbHelper = new SqliteHelper(c, "rss_db", null, 1);
        db = c.openOrCreateDatabase("rss_db",Context.MODE_PRIVATE,null);
        db.execSQL(createPostTableSql);
    }

    public static synchronized Rdatabase getDatabaseInstance(Context c) {
        if (instance == null) {
            instance = new Rdatabase(c);
        }
        return instance;
    }
    public void insertPost(String title,String author,String description) {
        ContentValues values = new ContentValues();
        values.put("title", title);
        values.put("author", author);
     //   values.put("link", post.link);
        values.put("description", description);
       // values.put("date", post.date);
        db.insert("posts", "", values);
    }

    public void  search(){
        db.execSQL("select * from posts");
    }



}
