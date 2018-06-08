package com.dxt2.dagger4demo55;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Administrator on 2018/6/7 0007.
 */

// 3创建应用层级的AppComponent
// 安装了两个module,一个是AndroidInjectionModule  ActivityModule
//@Component(modules = {AndroidInjectionModule.class,ActivityModule.class})
//public interface AppComponent {
//    void inject(DemoApplication application);
//}


@Component(modules = {AndroidInjectionModule.class,ActivityModule.class,FragmentModule.class})
public interface AppComponent {
    void inject(DemoApplication application);
}



