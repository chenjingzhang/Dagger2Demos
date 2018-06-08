package com.dxt2.dagger2demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* 1.  Lazy懒加载:
*比如我们有一台Computer,组件包括cpu,显卡等，那么系统启动后，Cpu等组件必须完成初始化后才能运行起来，
*但是Usb外设并不需要系统启动时跟着初始化，等到需要使用时插入usb接口接入计算机即可。
* 也就是并不着急初始化，需要用的时候再启动，这就是懒加载
*
* 转化到java中，也就是一个对象只有用的时候再初始化，这样可以避免不必要的内存开销。
*
* Dagger2中提供了懒加载，我们可以不用在注入的时候就初始化所有的对象
*
* cpu对象需要立即初始化，usb对象可以延迟加载
*
*
*
* 2Provider
*使用懒加载时 后续获取的都是同一个实例，后续中，需要使用懒加载且每次获取的都不是同一个实例，
*
* 3.元注解
* 给computer初始化鼠标，一种是有线鼠标一种是无线鼠标
*
*
* 4.singleton
* 给computer添加一个主板依赖，主板只有一个 ，且当计算机初始化时它也必须初始化
*要实现一个既不是懒加载又只会存在一个实例的主板 就要用到singleton
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Computer computer = new Computer();
        computer.init();
    }
}
