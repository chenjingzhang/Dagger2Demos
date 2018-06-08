package com.dxt2.dagger2demo;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class User {
    String name;

    @Inject
    public User(){
        this.name="Leon";
    }
}
