package com.dxt2.dagger2demo2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

/**
 * Created by Administrator on 2018/5/30 0030.
 */

public class Computer {
    @Inject
    Cpu mCpu; //在注入时初始化

    @Inject
    Lazy<Usb> mUsb; //声明Lazy<Usb>对象，只初始化Lazy<Usb>对象mUsb,但Usb对象没有初始化

    @Inject
    Provider<NetWork> mNetWork;

    @Inject
    @WMouseType("wireless")
    WMouse wMouse;

    //声明主板1
    @Inject
    XMainBoard xMainBoard1;
    //声明主板2
    @Inject
    XMainBoard xMainBoard2;


    public void init() {
        //注入，这时usb对象并没有初始化，只初始化Lazy<Usb>对象mUsb,但Usb对象没有初始化，
        //只有当我们调用Lazy<Usb> 对象mUsb 的get()时才会去创建一个Usb对象
        DaggerComputerComponent.builder().build().inject(this);
        //第一次创建一个usb对象，第二次返回第一次创建的usb对象
        Log.d("sss", "init" + mUsb.get());
        Log.d("sss", "init" + mUsb.get());
//      initcom.dxt2.dagger2demo2.Usb@3f60456
//      initcom.dxt2.dagger2demo2.Usb@3f60456

        //在注入时 Provider<NetWork>对象mNetWork会被初始化，调用mNetWork.get()会创建NetWork对象，每次创建的都不一样
        Log.d("sss", "mNetWork" + mNetWork.get());
        Log.d("sss", "mNetWork" + mNetWork.get());
//      mNetWorkcom.dxt2.dagger2demo2.NetWork@ccb99c4
//      mNetWorkcom.dxt2.dagger2demo2.NetWork@d2260ad

        Log.d("sss", "mMouse" + wMouse.name());
        // mMouseWireless Mouse

        Log.d("sss", "init" + xMainBoard1);
        Log.d("sss", "init" + xMainBoard2);
        //   initcom.dxt2.dagger2demo2.XMainBoard@afe7cd
//      initcom.dxt2.dagger2demo2.XMainBoard@afe7cd

    }
}
