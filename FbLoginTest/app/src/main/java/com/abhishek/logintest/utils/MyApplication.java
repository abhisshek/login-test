package com.abhishek.logintest.utils;

import android.app.Application;

import com.facebook.appevents.AppEventsLogger;

/**
 * Created by abhishek.kumar on 8/28/2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
