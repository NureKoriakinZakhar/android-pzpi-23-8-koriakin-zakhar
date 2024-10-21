package com.example.zakhar_koryakin_pzpi_23_8;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Життевий цикл", "onCreate");

        TextView textView = findViewById(R.id.text_view);
        textView.setText("Task 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Життевий цикл", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Життевий цикл", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Життевий цикл", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Життевий цикл", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Життевий цикл", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Життевий цикл", "onDestroy");
    }
}