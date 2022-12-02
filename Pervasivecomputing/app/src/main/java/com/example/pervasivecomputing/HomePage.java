package com.example.pervasivecomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

    }

    public void quizactivity(View view) {

        Intent myHomepage= new Intent(this,QuizActivity1.class);
        startActivity(myHomepage);
    }

    public void calculatorFunction(View view) {
        Intent mycalculatorpage= new Intent(this,CalculatorPage.class);
        startActivity(mycalculatorpage);
    }

    public void formfillup(View view) {
        Intent mycalculatorpage= new Intent(this,FormfillUp.class);
        startActivity(mycalculatorpage);
    }

    public void myself(View view) {
        Intent mycalculatorpage= new Intent(this,Myself.class);
        startActivity(mycalculatorpage);
    }

    public void writenote(View view) {
        Intent mycalculatorpage= new Intent(this,SingleDataEntry.class);
        startActivity(mycalculatorpage);

    }
}