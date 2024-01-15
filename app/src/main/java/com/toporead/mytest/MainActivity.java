package com.toporead.mytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> myData = Arrays.asList("text1","text2","text3");
        recyclerView =findViewById(R.id.myrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter =new MyAdapter(myData);
        recyclerView.setAdapter(myAdapter);
    }
}