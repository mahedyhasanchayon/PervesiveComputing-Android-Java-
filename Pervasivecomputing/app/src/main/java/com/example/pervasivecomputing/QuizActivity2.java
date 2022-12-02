package com.example.pervasivecomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class QuizActivity2 extends AppCompatActivity {
    int Totalmarks,previousMarks;
    static final String extramarks = "Marks From First Activity";
    RadioGroup q2radiogroupid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        Intent mygetIntent = getIntent();
        previousMarks =mygetIntent.getIntExtra(QuizActivity1.extramarks,0);
        q2radiogroupid=findViewById(R.id.q2myradiogroupid);
    }

    public void submitFunction(View view) {
        if(q2radiogroupid.getCheckedRadioButtonId()==R.id.q2myradiobtn1){
            Totalmarks=previousMarks+5;
        }
        else {
            Totalmarks=previousMarks+0;
        }
        Intent myIntent = new Intent(this,QuizActivity3.class);
        myIntent.putExtra(extramarks,Totalmarks);
        startActivity(myIntent);

    }
}