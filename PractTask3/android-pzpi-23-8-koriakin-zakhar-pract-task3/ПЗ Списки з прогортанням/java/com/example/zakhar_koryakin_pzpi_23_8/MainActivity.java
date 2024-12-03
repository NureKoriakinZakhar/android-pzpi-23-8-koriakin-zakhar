package com.example.zakhar_koryakin_pzpi_23_8;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] myDataset = {"Елемент 1", "Елемент 2", "Елемент 3", "Елемент 4", "Елемент 5", "Елемент 6", "Елемент 7", "Елемент 8", "Елемент 9", "Елемент 10", "Елемент 11", "Елемент 12", "Елемент 13", "Елемент 14", "Елемент 15", "Елемент 16", "Елемент 17", "Елемент 18", "Елемент 19", "Елемент 20", "Елемент 21"};

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(adapter);
    }
}
