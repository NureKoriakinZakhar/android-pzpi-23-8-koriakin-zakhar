package com.example.zakhar_koryakin_pzpi_23_8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonDialog).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, DialogActivity.class)));

        findViewById(R.id.buttonHandler).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, HandlerActivity.class)));
    }
}
