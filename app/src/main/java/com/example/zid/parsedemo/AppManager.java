package com.example.zid.parsedemo;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by zid on 23/12/15.
 */
public class AppManager extends Application {
    @Override
    public void onCreate() {
        System.out.println("Application is running");
        // [Optional] Power your app with Local Datastore. For more info, go to
        // https://parse.com/docs/android/guide#local-datastore
        Parse.enableLocalDatastore(this);

        Parse.initialize(this);
        super.onCreate();
    }
}
