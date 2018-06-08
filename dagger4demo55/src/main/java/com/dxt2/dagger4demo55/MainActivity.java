package com.dxt2.dagger4demo55;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

//5注入到MainActicity中

// 1. AndroidInjection.inject(this);
//
/* 会获取demoApplication中的dispatchingActicityInjector
*
* 2通过dispatchingFragmentInjector找到对应MainActivity的 AndroidInjector.Factory
* 即MainActicitySubComponent类中的buidler,
*
* 3.然后使用buidler创造MainActicity的注入器 AndroidInjector  即MainActicitySubComponent
*
* 4.最终使用MainActicitySubComponent完成对MainActivity的注入
*
* */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_main);
    }
    public static class MainFragment extends Fragment {
        @Inject
        User mUser;
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            TextView textView = new TextView(getActivity());
            textView.setTextColor(Color.WHITE);
            textView.setText(mUser.name);
            textView.setBackgroundColor(Color.BLUE);
            return textView;
        }

        @Override
        public void onAttach(Context context) {
            AndroidInjection.inject(this);
            super.onAttach(context);
        }
    }
}

































