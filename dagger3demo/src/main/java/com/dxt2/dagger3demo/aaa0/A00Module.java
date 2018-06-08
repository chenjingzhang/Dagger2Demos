package com.dxt2.dagger3demo.aaa0;

import dagger.Module;

/**
 * Created by Administrator on 2018/6/7 0007.
 */
@Module
public class A00Module {
    private A00Activity a00Activity;

    public A00Module(A00Activity a00Activity) {
        this.a00Activity = a00Activity;
    }

}
