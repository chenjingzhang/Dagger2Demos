package com.dxt2.dagger3demo.aaa2;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/30 0030.
 */
@Component(modules = A02Module.class,dependencies = AppComponent.class)
public interface A02Component {
    void inject(A02Activity a02Activity);
}

/*
* 需要Student对象和SharedPerferences对象，前者是A02Component提供的，
* 后者则需要「依赖（dependencies）」AppComponent提供，
* 等于这次inject(A02Activity activity)依赖注入需要两个Component共同出力完成。
*/
