package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RadioBtnActivity3 extends AppCompatActivity {
    double totalmarks=0;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn3);
        t=findViewById(R.id.text);
        Intent mygetIntent=getIntent();
        String getvalue = mygetIntent.getStringExtra(RadioBtnActivity.mk);
        totalmarks=Double.parseDouble(getvalue);
        t.setText(" "+totalmarks);
    }
    public void button(View view) {
        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);

    }
}