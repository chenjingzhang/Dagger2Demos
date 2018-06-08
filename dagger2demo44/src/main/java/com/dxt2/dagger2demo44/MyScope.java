package com.dxt2.dagger2demo44;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyScope {
}
