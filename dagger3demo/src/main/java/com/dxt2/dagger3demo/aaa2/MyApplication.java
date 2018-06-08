package com.dxt2.dagger3demo.aaa2;

import android.app.Application;

/**
 * Created by Administrator on 2018/5/30 0030.
 */


/*3、MyApplication: 在onCreate()方法中唯一一次初始化了AppComponent对象，并放入了ComponentHolder中。
     MyApplication （作为参数初始化）-> AppModule(初始化全局变量) -> (注入) AppComponent ->(存储到)ComponentHolder
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    private void inject() {
        AppComponent appComponent  = DaggerAppComponent.builder()  //new Builder()
                .appModule(new AppModule(this)) //传application
                .build();

        ComponentHolder.setMyAppComponent(appComponent);
    }
}
