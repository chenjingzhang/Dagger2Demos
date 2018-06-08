package com.dxt2.dagger3demo.aaa0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dxt2.dagger3demo.R;
import com.dxt2.dagger3demo.aaa1.A01Module;
import com.dxt2.dagger3demo.aaa1.DaggerA01Component;
import com.dxt2.dagger3demo.bean.Student;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.internal.DaggerCollections;

public class A00Activity extends AppCompatActivity {

    @BindView(R.id.btn_00)
    Button btn00;

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00);
        ButterKnife.bind(this);
//        DaggerA00Component.builder()
//                .build()          //new DaggerA01Component(this)
//                .inject(this);
        DaggerA00Component.builder().build().inject(this);
        Log.d("sss", "init" + student.toString());
    }

    @OnClick(R.id.btn_00)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_00:
                Toast.makeText(this, student.toString(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
