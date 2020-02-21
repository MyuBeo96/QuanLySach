package com.myubeo.quanlysach;

import android.app.Application;

public class App extends Application {
    private static App instance;

    public static App getInstance(){
        if(instance==null)
        {
            instance=new App();
        }
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        SqliteUtils sqliteUtils = SqliteUtils.getInstance();
//        sqliteUtils.initSqliteUtils(this);
//        sqliteUtils.openDB();
//
//        SharePreferencesHelper helper = SharePreferencesHelper.getInstance();
//        helper.initSharePreferencesHelper(this);
    }
}
