package com.dxt2.dagger2demo2;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
//XMainBoard需要@Singleton注解，ComputerComponent类也需要@Singleton注解


@Singleton
public class XMainBoard {
    @Inject
    public XMainBoard(){

    }
}
