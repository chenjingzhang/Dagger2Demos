package com.dxt2.dagger3demo.aaa2;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dxt2.dagger3demo.R;
import com.dxt2.dagger3demo.bean.Student;

import javax.inject.Inject;

import dagger.internal.Preconditions;

// https://blog.csdn.net/mq2553299/article/details/73251405
public class A02Activity extends AppCompatActivity {
    @Inject
    Student student;

    @Inject
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02);
        inject();
    }

    private void inject() {

        DaggerA02Component
                .builder()              // new Builder()
                .appComponent(ComponentHolder.getMyAppComponent()) //under
                .build()   // new DaggerA02Component(this)
                .inject(this);
        Log.d("tag", "======，Student = " + student.toString());
        Log.d("tag", "======，sp = " + sp.toString());

//    public DaggerA02Component.Builder appComponent(AppComponent appComponent) {
//        this.appComponent = Preconditions.checkNotNull(appComponent);
//        return this;
//    }

    }
}
