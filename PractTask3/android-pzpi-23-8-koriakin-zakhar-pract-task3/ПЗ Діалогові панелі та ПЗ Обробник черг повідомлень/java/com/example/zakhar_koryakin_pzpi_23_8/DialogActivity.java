package com.example.zakhar_koryakin_pzpi_23_8;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DialogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        findViewById(R.id.buttonAlertDialog).setOnClickListener(v -> {
            new AlertDialog.Builder(DialogActivity.this)
                    .setTitle("AlertDialog")
                    .setMessage("Це приклад AlertDialog.")
                    .setPositiveButton("OK", (dialog, which) -> Toast.makeText(this, "OK Натиснут", Toast.LENGTH_SHORT).show())
                    .setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss())
                    .show();
        });

        findViewById(R.id.buttonDatePickerDialog).setOnClickListener(v -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
                Toast.makeText(this, "Ви обрали дату: " + dayOfMonth + "/" + (month + 1) + "/" + year, Toast.LENGTH_SHORT).show();
            }, 2023, 0, 1);
            datePickerDialog.show();
        });

        findViewById(R.id.buttonCustomDialog).setOnClickListener(v -> {
            EditText editText = new EditText(this);
            editText.setHint("Введіть текст");
            new AlertDialog.Builder(this)
                    .setTitle("Custom Dialog")
                    .setView(editText)
                    .setPositiveButton("OK", (dialog, which) -> {
                        String input = editText.getText().toString();
                        Toast.makeText(this, "Введено: " + input, Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss())
                    .show();
        });
    }
}
