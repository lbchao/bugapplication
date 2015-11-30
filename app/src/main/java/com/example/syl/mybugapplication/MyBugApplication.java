package com.example.syl.mybugapplication;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by syl on 2015/11/30.
 */
public class MyBugApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this, "900013982", false);
    }
}
