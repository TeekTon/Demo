package com.example.tziyao.demo.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tziyao.supportdemo.R;

/**
 * Created by tziyao on 16/7/6.
 */
public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        initViews();
        initDatas();
    }

    private void initDatas() {

    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(this);
        mRecyclerView.setAdapter(myAdapter);
       // mRecyclerView.addItemDecoration(new Diver);
    }
}
