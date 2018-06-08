package com.dxt2.dagger2demo2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
//使用该注解来指定应该注入一个怎么样的鼠标，
//我们在MouseModule中分别指定两个方法返回一个怎样的鼠标，
// 再在Computer类中声明Mouse对象时指定它应该被注入一个什么类型的鼠标
@Module
public class WMouseModule {

    @Provides
    @WMouseType("wired")//指定该方法返回一个有线鼠标
    WMouse provideWireMouse(){
        return new WiredMouse();//返回有线鼠标
    }

    @Provides
    @WMouseType("wireless")//指定该方法返回一个无线鼠标
    WMouse provideWirelessMouse(){
        return new WirelessMouse();//返回无线鼠标
    }

}
