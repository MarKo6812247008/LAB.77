package com.example.lab7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Note myChecklist = new CheckListNote("Project Tasks", "2026-07-20", "1. Code OOP  2. Design UI");
        myChecklist.getSummary();

        //identify button in layout
        Button ClickIm = findViewById(R.id.button);
        Button Add = findViewById(R.id.button3);

        if (ClickIm != null) {
            ClickIm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("MADI!!!");
                    Intent intent = new Intent(getApplicationContext(), ClickmActivity2.class);
                    startActivity(intent);
                }
            });
        }

        if (Add != null) {
            Add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), NoteActivity2.class);
                    startActivity(intent);
                }
            });
        }
    }
}
