package com.dxt2.dagger3demo.aaa1;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/30 0030.
 */
@Component(modules = A01Module.class)
public interface A01Component {
    void inject(A01Activity activity);
}
//  Component接口上方的@Component(modules = A01SimpleModule.class)
//  说明这是一个【组件】（我更喜欢称呼它为注射器）。


/*
* @Inject ： 注入，被注解的构造方法会自动编译生成一个Factory工厂类提供该类对象。
* @Component: 注入器，类似快递员，作用是将产生的对象注入到需要对象的容器中，供容器使用。
* @Module: 模块，类似快递箱子，在Component接口中通过@Component(modules = xxxx.class),
* 将容器需要的商品封装起来，统一交给快递员（Component），让快递员统一送到目标容器中。
*/