package com.dxt2.dagger4demo55;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Administrator on 2018/6/7 0007.
 */
//4 DemoApplication类中，实现HasActivityInjector，返回一个全局的Activity的注入器dispatchingActicityInjector
//而它的初始化将有AppComponent完成，将AppComponent对应生成的 DaggerAppComponent在onCreate()中注入
//

public class DemoApplication extends Application implements HasActivityInjector, HasFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActicityInjector;
    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingFragmentInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActicityInjector;
    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return dispatchingFragmentInjector;
    }
}

























