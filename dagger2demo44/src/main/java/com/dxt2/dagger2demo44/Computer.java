package com.dxt2.dagger2demo44;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/6/6 0006.
 */

public class Computer {
    @Inject
    TouchPad mTouchPad;

    public void init() {
        //3
        DaggerComputerComponent.builder().build().laptopComponent().inject(this);
        Log.d("sss", "init: " + mTouchPad);
        // init: com.dxt2.dagger2demo44.TouchPad@465a391
    }
}
