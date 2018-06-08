package com.dxt2.dagger3demo.aaa3;

import com.dxt2.dagger3demo.aaa3.scope.ActivityScope;

import dagger.Component;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
@ActivityScope//添加注解实现局部单例
@Component(modules =  A03Module.class)
public interface A03Component {
    void inject(A03Activity a03Activity);
}
