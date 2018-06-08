package com.dxt2.dagger3demo.aaa1;

import com.dxt2.dagger3demo.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/5/30 0030.
 */


@Module
public class A01Module {
    private A01Activity a01Activity;

    public A01Module(A01Activity a01Activity) {
        this.a01Activity = a01Activity;
    }

   //通过@Providers注解后，产生的对象就经过Module包装，通过Component快递员送到需要的容器Activity中
    @Provides
    Student provideStudent() {
        return new Student();
    }
//Module类上方的@Module注解意味着这是一个提供数据的【模块】

//虽然@Inject注解取消了，但是我们已经在  快递箱子（Module）中 通过@Providers放入了一个Student对象，
// 然后让快递员（Component）送到了家中（Activity），我们当然可以使用Student对象了！
}
