package com.dxt2.dagger2demo33;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Provider;

/*Component的依赖关系
*
* Component之间存在一种依赖关系，如果一个Component无法提供某些对象的注入，
* 那么它可以依赖其他的可以提供该对象的Component来完成注入
*
*  需要在Computer中注入一个HardDisk250G的，而并没有使用@Inject的HardDisk250G构造方法
* ，所以ComputerComponent没有能力完成mHardDisk250G注入
*
* 但是有HardDiskComponent和HardDiskModule.它们可以提供硬盘
* HardDiskModule 可以提供HardDisk250G HardDisk500G
* HardDiskComponent指定它的Module为HardDiskModule
*
*ComputerComponent提供不了HardDisk250G的硬盘，但HardDiskComponent可以提供
*
* 而HardDiskComponent无法注入Computer中，因为没有inject方法
* 那么可以让ComputerComponent依赖HardDiskComponent，让HardDiskComponent代提供250G硬盘
* 可以使用dependence 声明ComputerComponent 依赖HardDiskComponent
*
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Computer computer = new Computer();
        computer.init();
    }
}



























