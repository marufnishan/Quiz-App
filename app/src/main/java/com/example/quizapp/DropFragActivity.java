package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropFragActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner mySpinner;
    Fragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_frag);

        mySpinner=findViewById(R.id.spinerID);
        ArrayAdapter<CharSequence> myAdapter=ArrayAdapter.createFromResource(this,R.array.dropdown, android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       String name = parent.getItemAtPosition(position).toString();
       if (name.equals("Quiz App")){
           myFragment=new FragmentA();
           FragmentManager fm=getSupportFragmentManager();
           FragmentTransaction ft= fm.beginTransaction();
           ft.replace(R.id.fragmentId,myFragment);
           ft.commit();
       }
       else if (name.equals("To Do App")){
           myFragment=new FragmentB();
           FragmentManager fm=getSupportFragmentManager();
           FragmentTransaction ft= fm.beginTransaction();
           ft.replace(R.id.fragmentId,myFragment);
           ft.commit();
       }
       else {
            myFragment=new BlankFragment();
           FragmentManager fm=getSupportFragmentManager();
           FragmentTransaction ft= fm.beginTransaction();
           ft.replace(R.id.fragmentId,myFragment);
           ft.commit();
       }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}