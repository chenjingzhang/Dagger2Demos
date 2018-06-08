package com.dxt2.dagger2demo44;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/6/6 0006.
 */

// 1 LaptopComponent是笔记本电脑的Componnet 它提供模板TouchPad的注入能力，TouchPad TouchPadMoule
@Singleton
@Subcomponent(modules = TouchPadModule.class)
public interface LaptopComponent {
    void inject(Computer computer);
}
