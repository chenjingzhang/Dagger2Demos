package com.dxt2.dagger3demo.aaa2;

import com.dxt2.dagger3demo.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/5/30 0030.
 */
@Module
public class A02Module {
    private A02Activity activity;

    public A02Module(A02Activity activity) {
        this.activity = activity;
    }

    @Provides
    static Student provideStudent() {
        return new Student();
    }
}
