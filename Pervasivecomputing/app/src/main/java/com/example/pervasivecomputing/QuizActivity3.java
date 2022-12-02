package com.example.pervasivecomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizActivity3 extends AppCompatActivity {
    int result;
    TextView resultID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        Intent mygetIntent = getIntent();
        result =mygetIntent.getIntExtra(QuizActivity2.extramarks,0);
        resultID=findViewById(R.id.resultID);
        resultShow();

    }

    private void resultShow() {
        resultID.setText("Your Marks = "+result);
    }

    public void tryAgain(View view) {
        Intent myIntent = new Intent(this,QuizActivity1.class);
        startActivity(myIntent);
    }

    public void gohomepage(View view) {
        Intent myIntent = new Intent(this,HomePage.class);
        startActivity(myIntent);
    }
}