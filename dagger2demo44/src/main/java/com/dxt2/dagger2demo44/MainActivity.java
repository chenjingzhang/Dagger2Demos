package com.dxt2.dagger2demo44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* 子Component将会有父Component的注入能力，并且可以在父Component的基础上增强注入能力。
* 这里父子Component并不真正具有java中类的继承关系，而应该只是一种扩展关系。
*
*
* 这里定义ComputerComponent的子Component为一个笔记本电脑的组件LaptopComponent
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Computer cc = new Computer();
        cc.init();
    }
}






















