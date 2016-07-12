package com.example.tziyao.demo.eventbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tziyao.supportdemo.R;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by tziyao on 16/7/12.
 */
public class EventBusActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus2);
    }

    public void onClick(View v){
        EventBus.getDefault().post(new TestEvent("test event bus..."));
    }
}
