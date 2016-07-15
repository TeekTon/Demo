package com.example.tziyao.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tziyao.demo.eventbus.EventBusActivity1;
import com.example.tziyao.demo.notifier.NotiferActivity1;
import com.example.tziyao.demo.recyclerview.RecycleViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickRycleView(View v) {
        //Toast.makeText(this, "RecycleView", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, RecycleViewActivity.class);
        startActivity(intent);
    }

    public void clickEventBus(View v) {
        //Toast.makeText(this, "RecycleView", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, EventBusActivity1.class);
        startActivity(intent);
    }

    public void clickNotifer(View v) {
        Intent intent = new Intent(this, NotiferActivity1.class);
        startActivity(intent);
    }


}
