package com.dxt2.dagger4demo55;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/6/8 0008.
 */

public class User {
    String name;

    @Inject
    public User() {
        this.name = "lse";
    }
}
