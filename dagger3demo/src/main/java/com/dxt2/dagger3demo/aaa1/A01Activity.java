package com.dxt2.dagger3demo.aaa1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dxt2.dagger3demo.R;
import com.dxt2.dagger3demo.bean.Student;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class A01Activity extends AppCompatActivity {
    @BindView(R.id.btn_001)
    Button btn01;

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01);
        ButterKnife.bind(this);
 //@Module +@Providers 提供注入“私有”工厂类
//然后通过Component 创建获得Activity,获得工厂类Provider，统一交给Injector

//最后Injector将Provider的get()方法提供的对象，
// 注入到Activity容器对应的成员变量中，我们就可以直接使用Activity容器中对应的成员变量了！

        DaggerA01Component.builder()
                .a01Module(new A01Module(this))
                .build()          //new DaggerA01Component(this)
                .inject(this);

        //快递员Component已经将对象Inject（注入）到了this（Activity）中了，
        // 既然快递到家，我们当然可以直接使用Student啦！

        // Module 它的作用就好像是快递的箱子，里面装载的是我们想要的商品，我们在Module中放入什么商品，
        // 快递员（Component）将箱子送到我们家（Activity容器），我们就可以直接使用里面的商品啦

    }
//    @Override
//    public void inject(A01Activity activity) { //传this
//        injectA01Activity(activity);
//    }
//
//    private A01Activity injectA01Activity(A01Activity instance) {
//        A01Activity_MembersInjector.injectStudent(instance, new Student());
//        return instance;
//    }
//
//     public static void injectStudent(A01Activity instance, Student student) {
//         instance.student = student;
//       }


    @OnClick(R.id.btn_001)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.btn_001:
                Toast.makeText(this,student.toString(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
