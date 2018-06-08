package com.dxt2.dagger3demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dxt2.dagger3demo.aaa0.A00Activity;
import com.dxt2.dagger3demo.aaa1.A01Activity;
import com.dxt2.dagger3demo.aaa2.A02Activity;
import com.dxt2.dagger3demo.aaa3.A03Activity;

import java.nio.Buffer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView((R.id.btn_a01))
    Button btnA01Base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_a00,R.id.btn_a01,R.id.btn_a02,R.id.btn_a03})
    public void onViewClicked(View view){
        switch (view.getId()){
            case R.id.btn_a00:
                startActivity(new Intent(this, A00Activity.class));
                break;
            case R.id.btn_a01:
                startActivity(new Intent(this, A01Activity.class));
                break;
            case R.id.btn_a02:
                startActivity(new Intent(this, A02Activity.class));
                break;
            case R.id.btn_a03:
                startActivity(new Intent(this, A03Activity.class));
                break;


        }
    }
}
