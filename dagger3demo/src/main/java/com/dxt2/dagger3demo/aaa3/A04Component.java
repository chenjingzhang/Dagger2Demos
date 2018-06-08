package com.dxt2.dagger3demo.aaa3;

import com.dxt2.dagger3demo.aaa3.scope.ActivityScope;

import dagger.Component;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
@ActivityScope
@Component(modules = A04Module.class)
public interface A04Component {
     void inject(A04Acitivity a04Acitivity);
}
