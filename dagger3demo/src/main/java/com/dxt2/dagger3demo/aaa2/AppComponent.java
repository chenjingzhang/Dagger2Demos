package com.dxt2.dagger3demo.aaa2;

import android.content.SharedPreferences;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/30 0030.
 */

/*AppComponent：注入器，储存了我们要用到的全局变量对象
*/
@Component(modules = AppModule.class)
public interface AppComponent {
    SharedPreferences sharedPreference();

    MyApplication myApplication();
    //

}
