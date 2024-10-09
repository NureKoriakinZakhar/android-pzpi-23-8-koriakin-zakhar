package com.example.zakhar_koryakin_pzpi_23_8;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Повідомлення Активність2", "onCreate called");

        Button finishButton = findViewById(R.id.button);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Повідомлення Активність2", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Повідомлення Активність2", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Повідомлення Активність2", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Повідомлення Активність2", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Повідомлення Активність2", "onDestroy called");
    }
}
