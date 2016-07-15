package com.example.tziyao.demo.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tziyao.demo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tziyao on 16/7/8.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    private List<String> texts;

    public MyAdapter(Context context) {
        mContext = context;
        texts = new ArrayList<>();
        for (int i = 'A'; i <= 'Z'; i++) {
            texts.add(((char)i)+"");
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_recyclerview, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(texts.get(position));
    }


    @Override
    public int getItemCount() {
        return texts.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv_text);
        }
    }
}
