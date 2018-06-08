package com.dxt2.dagger3demo.aaa3;

import com.dxt2.dagger3demo.aaa3.scope.ActivityScope;
import com.dxt2.dagger3demo.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
@Module
public class A04Module {
    private A04Acitivity a04Acitivity;

    public A04Module(A04Acitivity a04Acitivity) {
        this.a04Acitivity = a04Acitivity;
    }

    @ActivityScope
    @Provides
    Student provideStudent() {
        return new Student();
    }
}
