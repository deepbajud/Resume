package com.example.resumebajud;

import android.content.Intent;
import android.os.Bundle;
 import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button blinkingButton = findViewById(R.id.blinkingButton);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        Animation myFadeOutAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);


        blinkingButton.startAnimation(myFadeInAnimation);
        blinkingButton.startAnimation(myFadeOutAnimation);
        blinkingButton.setOnClickListener(v -> {


            Intent Intent = new Intent(MainActivity.this,Personal_Information.class);
            startActivity(Intent);
        });
    }
}