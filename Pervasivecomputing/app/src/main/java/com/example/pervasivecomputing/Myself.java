package com.example.pervasivecomputing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Myself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myself);
    }
    public void buttonFunction(View view) {
        Fragment myfragment;

        if(view.getId()==R.id.detailsID){
            myfragment=new Mydetails();

        }
        else {
            myfragment=new MyContact();

        }
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.fragmentactivityID,myfragment);
        ft.commit();
    }
}