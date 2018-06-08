package com.dxt2.dagger2demo2;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/30 0030.
 */
////1懒加载 2Provider
//@Component
//public interface ComputerComponent {
//    void inject(Computer computer);
//}


//3 Qualifier是一个元注解，它的target是annotation_type 表示它可以修饰一个注解类型

// 因为在WMouseModule中提供了两个方法返回不同的Mouse对象，而Computer中注入一个Mouse对象，
// 这时就需要我们在Computer类中添加WMouse依赖时指定使用哪个方法返回一个WMouse对象。
//@Component(modules = WMouseModule.class)
//public interface ComputerComponent {
//    void inject(Computer computer);
//}

//4Singleton  @Scole效果相同
 //我们使用@Singleton分别注解XMainBoard和ComputerComponent类，表明将XMainBoard和ComputerComponent绑定
//一个ComputerComponent对象只会存在一个XMainBoard实例，即使我们在Computer类中声明了两个MainBoard对象，
// 注入之后，这两个对象实际上指向的是同一个MainBoard的对象。
@Singleton
@Component(modules = WMouseModule.class)
public interface ComputerComponent {
    void inject(Computer computer);
}