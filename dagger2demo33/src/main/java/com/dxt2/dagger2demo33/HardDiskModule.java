package com.dxt2.dagger2demo33;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
/**
 * Created by Administrator on 2018/6/6 0006.
 */
@Module
public class HardDiskModule {
    @Singleton
    @Provides
    HardDisk250G provideHardDisk250G() {
        return new HardDisk250G();
    }

    @Provides
    HardDisk500G provideHardDisk500G(){
        return new HardDisk500G();
    }
}
