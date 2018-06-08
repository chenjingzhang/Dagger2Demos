package com.dxt2.dagger2demo33;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/6/6 0006.
 */

public class Computer {
    @Inject
    HardDisk250G mHardDisk250G;

    public void init() {
        DaggerComputerComponent.builder().hardDiskComponent(DaggerHardDiskComponent.create())
                .build().inject(this);

        Log.d("sss", "init: " + mHardDisk250G);//init: com.dxt2.dagger2demo33.HardDisk250G@a4302f6
    }
}
