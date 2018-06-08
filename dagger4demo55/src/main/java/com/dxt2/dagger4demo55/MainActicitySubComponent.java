package com.dxt2.dagger4demo55;

import android.widget.TextView;

import java.util.Random;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
// MainActivity中User对象的注入

//1.创建MainActicitySubComponent

//MainActicitySubComponent是MainActicity对应的Component,它是应用层级Component的子Component,所以用@Subcomponent注解
//AndroidInjector是Activity的核心类，可以完成对Activity或Fragment的成员变量的注入，
//可以用Builder类来创建MainActicitySubComponent的实例

/*@Subcomponent
public interface MainActicitySubComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }

    //在MainActicitySubCompont  内部类Builder中实现seedInstance(),并创建抽象方法textViewModule
    //接收TextViewModule对象作为参数，在seedInstance() 调用textViewModule()传入 TextViewModule实例
    //这时 MainActicitySubCompont 就具有TextView的能力

}*/

@Subcomponent(modules = TextViewModule.class)
public interface MainActicitySubComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
        abstract void textViewModule(TextViewModule textViewModule);

        public void seedInstance(MainActivity instance) {
            textViewModule(new TextViewModule(instance));
        }
        //TextView的注入
        //在MainActicitySubCompont  内部类Builder中实现seedInstance(),并创建抽象方法textViewModule
        //接收TextViewModule对象作为参数，在seedInstance() 调用textViewModule()传入 TextViewModule实例
        //这时 MainActicitySubCompont 就具有TextView的能力


        //Fragment的注入
/*
* Activity对应的注入器一般作为Application对应的注入器SubComponent,
* 而Fragment对用的注入器可以是其他Activity Fragment 或者Application 对应Component的SubComponent,
*这要看Fragment的Module是安装到哪个Component上
*
*   在MainActivity的内部MainFragment中也注入一个User对象
* */


    }
}
