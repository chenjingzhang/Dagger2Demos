package com.dxt2.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

import javax.inject.Inject;
//注入原则：一个类应该不知道自己何时被注入。
//这里还是可以通过build()和TextViewModule()知道类何时被注入，违反注入的原则。

public class MainActivity extends AppCompatActivity {
    @Inject
    User mUser;

    @Inject
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1内部会调用User的构造方法完成成员变量mUser的初始化
//        DaggerMainComponent.builder().build().inject(this);
//        Log.d("sss", "onCreate" + mUser.name);

        //2传入TextViewModule
        DaggerMainComponent.builder().textViewModule(new TextViewModule(this)).build().inject(this);
        FrameLayout frameLayout = findViewById(R.id.frame);
        mTextView.setText(mUser.name);
        frameLayout.addView(mTextView);
    }
}
