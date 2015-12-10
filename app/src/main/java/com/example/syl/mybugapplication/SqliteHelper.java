package com.example.syl.mybugapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by syl on 2015/11/30.
 */
public class SqliteHelper extends SQLiteOpenHelper {

    private static final String createPostTableSql = "create table posts (" +
            "_id integer primary key autoincrement," +
            "title varchar," +
            "author varchar," +
            "link varchar," +
            "description varchar," +
            "date varchar)";

    private Context context;

    public SqliteHelper(Context c, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(c, name, factory, version);
        context = c;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createPostTableSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists posts");
        onCreate(db);
    }
}
