package com.dxt2.dagger3demo.aaa3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.dxt2.dagger3demo.R;
import com.dxt2.dagger3demo.bean.Student;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

// @Singleton:全局单例注解
//自定义@Scope注解
/*
* 也就是说,在添加@ActivityScope后，该Activity中通过@Inject依赖注入生成的Student对象全部唯一，
* 但单例范围仅仅是该Activity中，出了该Activity，生成的Student仍然是非单例的。
* */


/*
*仅仅通过这样一个声明，就能实现对象的生成和Activity的生命周期绑定吗？
* 只要该Activity存在，里面的Student对象就是单例？
* 答案：
* 自定义的@Singleton、@ActivityScope注解根本就没有这些功能,它的作用仅仅是”标记“。
无论是否添加@ActivityScope注解，自动生成的文件目录中文件的数量都没有改变
自定义@Scope注解并没有生成任何文件。
*/

public class A03Activity extends AppCompatActivity {
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_student1)
    TextView tvStudent1;
    @BindView(R.id.tv_student2)
    TextView tvStudent2;

    @Inject
    Student student1;
    @Inject
    Student student2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a03);
        ButterKnife.bind(this);
        DaggerA03Component.builder().
                a03Module(new A03Module(this))
                .build()
                .inject(this);

        tvStudent1.setText(student1.toString());
        tvStudent2.setText(student2.toString());
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        startActivity(new Intent(this, A04Acitivity.class));
    }
}
