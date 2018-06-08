package com.dxt2.dagger3demo.aaa3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dxt2.dagger3demo.R;
import com.dxt2.dagger3demo.bean.Student;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class A04Acitivity extends AppCompatActivity {

    @BindView(R.id.tv_student)
    TextView textView;

    @Inject
    Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a04_acitivity);
        ButterKnife.bind(this);

        DaggerA04Component.builder()
                .a04Module(new A04Module(this))
                .build()
                .inject(this);

        //打印student
        textView.setText(student.toString());
    }
}
