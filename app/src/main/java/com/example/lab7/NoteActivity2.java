package com.example.lab7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;

public class NoteActivity2 extends AppCompatActivity {
    //Attribute
    Button BackMain, Submit;

    EditText title;
    EditText content;
    EditText userName;
    TextView textView;
    RadioGroup radioGroupNoteType;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_note2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BackMain = findViewById(R.id.button5);
        title = findViewById(R.id.editTextText);
        content = findViewById(R.id.editTextText2);
        userName = findViewById(R.id.editTextUser);
        textView = findViewById(R.id.textView2);
        Submit = findViewById(R.id.button6);
        radioGroupNoteType = findViewById(R.id.radioGroupNoteType);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get data from edittext
                String strOfTitle = title.getText().toString();
                String strOfContent = content.getText().toString();
                String strOfUser = userName.getText().toString();
                String date = new Date().toString();

                // Create User
                User user = new User();
                user.username = strOfUser;

                Note note;
                if (radioGroupNoteType.getCheckedRadioButtonId() == R.id.radioChecklist) {
                    CheckListNote checklistNote = new CheckListNote();
                    checklistNote.setTitle(strOfTitle);
                    checklistNote.setItem(strOfContent);
                    checklistNote.setCreatedDate(date);
                    note = checklistNote;
                } else {
                    TextNote textNote = new TextNote();
                    textNote.setTitle(strOfTitle);
                    textNote.setContent(strOfContent);
                    textNote.setCreatedDate(date);
                    note = textNote;
                }

                // Associate User with Note
                note.setUser(user);

                // show note
                textView.setText(note.getsummary());
            }
        });

        BackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
