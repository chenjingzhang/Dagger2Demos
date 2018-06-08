package com.dxt2.dagger3demo.aaa2;

/**
 * Created by Administrator on 2018/5/30 0030.
 */

public class ComponentHolder {
    private static AppComponent myAppComponent;

    public static void setMyAppComponent(AppComponent myAppComponent) {
        ComponentHolder.myAppComponent = myAppComponent;
    }

    public static AppComponent getMyAppComponent() {
        return myAppComponent;
    }
}




































