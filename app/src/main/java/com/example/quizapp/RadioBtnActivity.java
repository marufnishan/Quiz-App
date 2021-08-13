package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class RadioBtnActivity extends AppCompatActivity {
    RadioGroup myRadionGroup1,myRadionGroup2;
    static final String mk="m3";
    double marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn);
        myRadionGroup1=findViewById(R.id.rg1);
        myRadionGroup2=findViewById(R.id.rg2);
    }
    public void next1(View view) {
        if(myRadionGroup1.getCheckedRadioButtonId()==R.id.r1)
        {
            marks=2;
        }
        if(myRadionGroup2.getCheckedRadioButtonId()==R.id.rb1)
        {
            marks=marks+2;
        }
        String str=String.valueOf(marks);
        Intent myIntent=new Intent(this,RadioBtnActivity2.class);
        myIntent.putExtra(mk,str);
        startActivity(myIntent);
    }
}