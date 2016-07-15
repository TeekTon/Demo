package com.example.tziyao.demo.notifier;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.tziyao.demo.R;

/**
 * Created by tziyao on 16/7/15.
 */
public class NotiferActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus1);
        NotifierManager.getInstance().getTestNotifer().addEventListener(this, "onTest", String.class, int.class);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, NotiferActivity2.class);
        startActivity(intent);
    }

    public void onTest(String param1, int param2) {
        Toast.makeText(this, "测试数据param1=" + param1 + ",param2=" + param2, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        NotifierManager.getInstance().getTestNotifer().removeEventListener(this);
    }
}
