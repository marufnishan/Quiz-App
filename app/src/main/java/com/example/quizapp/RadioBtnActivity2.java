package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class RadioBtnActivity2 extends AppCompatActivity {
    RadioGroup myRadionGroup1,myRadionGroup2;
    double totalmarks=0;
    static final String mk="m3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn2);
        myRadionGroup1=findViewById(R.id.rg1);
        myRadionGroup2=findViewById(R.id.rg2);

        Intent mygetIntent=getIntent();
        String getValue = mygetIntent.getStringExtra(RadioBtnActivity.mk);
        totalmarks=Double.parseDouble(getValue);
    }
    public void next(View view) {
        if(myRadionGroup1.getCheckedRadioButtonId()==R.id.r4)
        {
            totalmarks =totalmarks+ 2;
        }
        if(myRadionGroup2.getCheckedRadioButtonId()==R.id.rb4)
        {
            totalmarks =totalmarks+ 2;
        }


        String str=String.valueOf(totalmarks);
        Intent myIntent=new Intent(this,RadioBtnActivity3.class);
        myIntent.putExtra(mk,str);
        startActivity(myIntent);
    }
}