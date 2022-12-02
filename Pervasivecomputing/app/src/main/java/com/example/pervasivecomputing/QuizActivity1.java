package com.example.pervasivecomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class QuizActivity1 extends AppCompatActivity {
    RadioGroup myradiogroup;
    int marks;
    static final String extramarks = "Marks From First Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        myradiogroup=findViewById(R.id.myradiogroupid);
    }

    public void nextFunction(View view) {
        if(myradiogroup.getCheckedRadioButtonId()==R.id.myradiobtn3){
            marks =5;
        }
        else {
            marks=0;
        }
        Intent myIntent = new Intent(this,QuizActivity2.class);
        myIntent.putExtra(extramarks,marks);
        startActivity(myIntent);
    }
}