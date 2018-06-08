package com.dxt2.dagger4demo55;

import android.content.Context;
import android.widget.TextView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/6/8 0008.
 */
@Module
public class TextViewModule  {
    private Context mContext;


    public TextViewModule(Context context) {
        this.mContext = context;
    }
    @Provides
    TextView provideTextView(Context context){
        return new TextView(context);
    }

    @Provides
    Context provideContext(){
        return mContext;
    }
}
