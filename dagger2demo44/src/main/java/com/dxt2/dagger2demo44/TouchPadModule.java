package com.dxt2.dagger2demo44;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
@Module
public class TouchPadModule {
    @Provides
    @Singleton
    TouchPad provideTouchPad() {
        return new TouchPad();
    }

}
