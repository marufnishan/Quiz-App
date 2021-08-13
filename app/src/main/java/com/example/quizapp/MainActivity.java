package com.example.quizapp;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView title;
    private Button start;
    private Button todo;
    private Button dropfag;
    private Button navigat;
    private Button rbquiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.main_title);
        start = findViewById(R.id.ma_startB);
        todo = findViewById(R.id.ma_startB2);
        dropfag = findViewById(R.id.ma_startB3);
        navigat = findViewById(R.id.ma_startB4);
        rbquiz = findViewById(R.id.ma_startBRadio);

        Typeface typeface = ResourcesCompat.getFont(this,R.font.blacklist);
        title.setTypeface(typeface);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
            startActivity(intent);
            }
        });

        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TodoSplashActivity.class);
                startActivity(intent);
            }
        });
        dropfag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DropFragActivity.class);
                startActivity(intent);
            }
        });
        navigat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NavigationActivity.class);
                startActivity(intent);
            }
        });
        rbquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RadioBtnActivity.class);
                startActivity(intent);
            }
        });

    }
}