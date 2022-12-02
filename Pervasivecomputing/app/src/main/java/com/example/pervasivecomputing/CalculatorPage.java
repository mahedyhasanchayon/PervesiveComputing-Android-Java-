package com.example.pervasivecomputing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorPage extends AppCompatActivity {
    EditText firstvalue,secondvalue;
    TextView resultview;
    double num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_page);
        firstvalue=findViewById(R.id.firstvalue);
        secondvalue=findViewById(R.id.secondvalue);
        resultview=findViewById(R.id.reult);
    }
    public void calculateFunction(View view) {
        num1= Double.parseDouble(firstvalue.getText().toString());
        num2= Double.parseDouble(secondvalue.getText().toString());
        result = (num2)/((num1*.3048)*(num1*.3048));
        resultview.setText(String.format("Result : %.2f",+result));
    }


    public void backfunction(View view) {
        Intent mycalculatorpage= new Intent(this,HomePage.class);
        startActivity(mycalculatorpage);
    }
}