package com.dxt2.dagger3demo.aaa2;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/5/30 0030.
 */
/*
1、AppModule：初始化全局变量
* */


@Module
public class AppModule {
    private MyApplication myApplication;

    public AppModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    //提供全局的sp对象
    @Provides
    SharedPreferences provideSharedPreferences(){
        return myApplication.getSharedPreferences("spfile", Context.MODE_PRIVATE);
    }

    //提供全局的Application对象
    @Provides
    MyApplication provideApplication() {
        return myApplication;
    }
}































