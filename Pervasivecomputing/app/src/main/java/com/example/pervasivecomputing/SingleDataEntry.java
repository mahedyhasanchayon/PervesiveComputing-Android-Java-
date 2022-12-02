package com.example.pervasivecomputing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SingleDataEntry extends AppCompatActivity {
    EditText myNotes,uniqueKey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_data_entry);
        myNotes =findViewById(R.id.noteaddID);
        uniqueKey=findViewById(R.id.uniqueKeyID);
    }
    public void saveFunctions(View view) {
        String nameDatas= myNotes.getText().toString();
        String uniqueKey= this.uniqueKey.getText().toString();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Notes");

        myRef.child(uniqueKey).setValue(nameDatas);

        finish();
        startActivity(getIntent());

    }
}