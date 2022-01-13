package com.app.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
      RecyclerView recyclerView;
    public ArrayList<Model> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylerView_id);
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        list.add(new Model("Harsh Shukla","Student at NITJ"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(list));



    }
}