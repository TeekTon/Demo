package com.example.tziyao.demo.notifier;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tziyao.demo.R;

/**
 * Created by tziyao on 16/7/15.
 */
public class NotiferActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus2);
    }

    public void onClick(View v) {
        NotifierManager.getInstance().getTestNotifer().sendNotify("hello entruser", 2222);
    }
}
