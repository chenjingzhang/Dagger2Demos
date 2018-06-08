package com.dxt2.dagger2demo33;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
/*
*error @Singleton component cannot depend on scoped components:
@Singleton com.dxt2.dagger2demo33.HardDiskComponent

使用@Singleton注解的ComputerComponent不能依赖一个已经有作用域的Component
因为HardDiskComponent中也使用到了@Singleton注解
* */
//@Singleton
@MyScope
@Component(dependencies = HardDiskComponent.class)
public interface ComputerComponent {
    void inject(Computer computer);
}
