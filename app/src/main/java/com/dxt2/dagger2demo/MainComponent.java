package com.dxt2.dagger2demo;
import dagger.Component;

/**
 * Created by Administrator on 2018/5/29 0029.
 */
//将User对象注入到MainActivity中，完成对mUser的赋值
//@Component
//public interface MainComponent {
//   void inject(MainActivity mainActivity);
//}

@Component(modules = TextViewModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}



