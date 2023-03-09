package com.example.resumebajud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pd01 = pd1.getText().toString().trim();
                String pd02  = pd1.getText().toString().trim();
                String pd03 = pd1.getText().toString().trim();
                String pd04 = pd1.getText().toString().trim();

                Bundle personal_detail = new Bundle();
                personal_detail.putString("name", pd01);
                personal_detail.putString("number", pd02);
                personal_detail.putString("email", pd03);
                personal_detail.putString("date", pd03
                );

                if (pd01.isEmpty()) {
                    pd1.setError("Please enter name!");
                } else if (pd02.isEmpty()) {
                    pd2.setError("Please enter number!");
                } else if (pd03.isEmpty()) {
                    pd3.setError("Please enter Address!");
                } else if (pd04.isEmpty()) {
                    pd4.setError("Please enter email!");
                } else {


                    Intent Intent = new Intent(Personal_Information.this, Work_History.class);
                    startActivity(Intent);

                }
                            }
        });






    }
}