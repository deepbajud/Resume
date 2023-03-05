package com.example.resumebajud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Personal_Information extends AppCompatActivity {

    private EditText pd1;
    private EditText pd2;
    private EditText pd4;
    private EditText pd3;
    private TextView btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);

        pd1 =(EditText) findViewById(R.id.pd1);
        pd2 =(EditText) findViewById(R.id.pd2);
        pd3 =(EditText) findViewById(R.id.pd3);
        pd4 =(EditText) findViewById(R.id.pd4);
        btnNext =(TextView) findViewById(R.id.btnNext);






    }
}