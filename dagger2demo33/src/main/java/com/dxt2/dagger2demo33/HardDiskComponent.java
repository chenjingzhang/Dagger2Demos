package com.dxt2.dagger2demo33;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Administrator on 2018/6/6 0006.
 */
//如果使用HardDiskComponent可以提供HardDisk250G的硬盘

@Singleton
@Component(modules = HardDiskModule.class)
public interface HardDiskComponent {
    HardDisk250G getHardDisk250G();

//  void inject(Computer computer);
}



