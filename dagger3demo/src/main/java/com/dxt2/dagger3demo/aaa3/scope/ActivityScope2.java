package com.dxt2.dagger3demo.aaa3.scope;
/**
 * Created by Administrator on 2018/6/5 0005.
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope2 {
}
