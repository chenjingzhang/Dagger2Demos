package com.dxt2.dagger2demo;

import android.content.Context;
import android.widget.TextView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/5/29 0029.
 */
//Module是为了解决不能够通过注解构造方法来创建一个实例的问题，可以把Module看成一个对象工厂
@Module
public class TextViewModule {

    private Context mContext;

    public TextViewModule(Context mContext) {
        this.mContext = mContext;
    }

    //如果User类中不带@inject
    @Provides
    TextView provideTextView(Context context) {
        return new TextView(context);
    }

    @Provides
    Context provideContext(){
        return mContext;
    }

}
