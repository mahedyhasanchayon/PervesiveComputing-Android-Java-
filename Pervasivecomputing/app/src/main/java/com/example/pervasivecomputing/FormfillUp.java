package com.example.pervasivecomputing;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormfillUp extends AppCompatActivity {
    EditText nameID,studentID,ageID,weightID,heightID;
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formfill_up);
        nameID=findViewById(R.id.nameID);
        studentID=findViewById(R.id.studentId);
        saveButton=findViewById(R.id.savebuttonID);
        ageID=findViewById(R.id.ageID);
        weightID=findViewById(R.id.weightID);
        heightID=findViewById(R.id.heightID);


    }
    public void saveFunction(View view) {
        String nameData=nameID.getText().toString();
        String studentId=studentID.getText().toString();
        String ageId=ageID.getText().toString();
        String weightId=weightID.getText().toString();
        String heightId=heightID.getText().toString();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Registrations");

        myRef.child(studentId).setValue("Name-"+nameData+" ,"+"Age-"+ageId+" ,"+"Weight-"+weightId+" ,"+"Height-"+heightId);
        finish();
        startActivity(getIntent());

    }

    public void backtohome(View view) {
        Intent mynextpage= new Intent(this,HomePage.class);
        startActivity(mynextpage);
    }
}