package com.example.zakhar_koryakin_pzpi_23_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Повідомлення Активність1", "onCreate called");

        findViewById(R.id.button).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
        });

        if (savedInstanceState != null) {
            String savedText = savedInstanceState.getString("savedText");
            EditText editText = findViewById(R.id.editText);
            editText.setText(savedText);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Повідомлення Активність1", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Повідомлення Активність1", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Повідомлення Активність1", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Повідомлення Активність1", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Повідомлення Активність1", "onDestroy called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        EditText editText = findViewById(R.id.editText);
        outState.putString("savedText", editText.getText().toString());
        Log.d("Повідомлення Активність1", "onSaveInstanceState called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Повідомлення Активність1", "onRestoreInstanceState called");
    }
}