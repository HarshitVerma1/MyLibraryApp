package com.harshit.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<BookData> list;
    private RecyclerView recyclerView;
    private BookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<>();
        initList();
        recyclerView=findViewById(R.id.recyclerView);
        adapter=new BookAdapter(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void initList() {
        list.add(new BookData("DataBase Management System","DBMS.pdf"));
        list.add(new BookData("JAVA Programming","java.pdf"));
        list.add(new BookData("Python Programming","python.pdf"));
        list.add(new BookData("JavaScript Programming","javascript.pdf"));
        list.add(new BookData("Android App Development","android.pdf"));

    }


}