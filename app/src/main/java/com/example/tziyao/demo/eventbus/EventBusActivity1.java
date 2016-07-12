package com.example.tziyao.demo.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tziyao.supportdemo.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by tziyao on 16/7/12.
 */
public class EventBusActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus1);
        EventBus.getDefault().register(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, EventBusActivity2.class);
        startActivity(intent);
    }

    @Subscribe
    public void onEvent(TestEvent event) {
        String message = event.getMessage();
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
