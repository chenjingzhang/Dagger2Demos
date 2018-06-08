package com.dxt2.dagger2demo44;

import dagger.Component;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
//2另外需要在ComputerComponent中暴露子Component,由于LaptopComponent已经有inject(),需要将ComputerComponent的inject()注释掉。

@MyScope
@Component
public interface ComputerComponent {
    LaptopComponent laptopComponent();
}
