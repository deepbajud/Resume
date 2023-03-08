package com.example.resumebajud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        Animation blinkingAnimation = AnimationUtils.loadAnimation(this, R.anim.blinking_button_animation);


        blinkingButton.startAnimation(blinkingAnimation);
        blinkingButton.setOnClickListener(v -> {


            Intent Intent = new Intent(MainActivity.this,Personal_Information.class);
            startActivity(Intent);
        });
    }
}