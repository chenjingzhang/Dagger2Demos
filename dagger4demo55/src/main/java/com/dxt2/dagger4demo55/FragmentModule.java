package com.dxt2.dagger4demo55;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Administrator on 2018/6/8 0008.
 */
/*  1.创建FragmentModule
@ContributesAndroidInjector 可以自动生成MainFragment对应的Component

2.安装FragmentModule
那么生成的Component到底对应谁的SubComponent呢，这要看FragmentModule安装到哪里了

这里FragmentModule要安装到AppComponnet中，那么MainFragment的Component将是AppComponent的SubComponnet
在AppComponnet中增加FragmentModule.class的modules

3.注入Application
实现HasActivityInjector  返回dispatchingFragmentInjector

4.注入Fragment
在Fragment的onAttach()中，注入

* */
@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract MainActivity.MainFragment contributeMainActivityInjector();
}
