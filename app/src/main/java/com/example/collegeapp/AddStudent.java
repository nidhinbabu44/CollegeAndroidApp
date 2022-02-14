package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
AppCompatButton b1, b2;
String getName,getRollno,getAdmissionnum,getCollege;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.namestudent);
        ed2=(EditText) findViewById(R.id.rollnum);
        ed3=(EditText) findViewById(R.id.addnum);
        ed4=(EditText) findViewById(R.id.college);
        b1=(AppCompatButton)findViewById(R.id.stusubbut);
        b2=(AppCompatButton)findViewById(R.id.backbut);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getRollno=ed2.getText().toString();
                getAdmissionnum=ed3.getText().toString();
                getCollege=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getName, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getRollno, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getAdmissionnum, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getCollege, Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),DashBoardActivity.class);
                startActivity(i);
            }
        });
    }
}