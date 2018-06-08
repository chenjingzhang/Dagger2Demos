package com.dxt2.dagger4demo55;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
//2 创建 ActivityModule

//ActivityModule可以提供各个Activity对应的AndroidInjector.Factory（注入器工厂类），
//subcomponents = MainActicitySubComponent.class
// 表明MainActicitySubComponent是任何使用ActivityModule的Component的子Component

@Module(subcomponents = MainActicitySubComponent.class)
public abstract class ActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActicitySubComponent.Builder builder);


    /*以上步骤可以完成对activity的注入，如果想要注入某个Activity，就必须创建该activity对应的Component
     另外每增加一个Component,就要在ActivityModule中添加SubComponents的集合中添加它
    *
    *事实上，Activity对应Component的创建 可以使用注解@ContributesAndroidInjector自动生成
    * */
    // 如果ActivityModule
//    @ContributesAndroidInjector
//    abstract MainActivity contributeMainActivityInjector();
}
