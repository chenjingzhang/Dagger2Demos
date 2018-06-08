package com.dxt2.dagger3demo.aaa3;

import com.dxt2.dagger3demo.aaa3.scope.ActivityScope;
import com.dxt2.dagger3demo.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
@Module
public class A03Module {
private A03Activity activity;

    public A03Module(A03Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope //添加注解实现局部单例
    Student provideStudent(){
        return new Student();
    }

}
