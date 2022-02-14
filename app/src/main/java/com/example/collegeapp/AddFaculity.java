package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFaculity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1, b2;
    String getFaculityName,getDepartment,getQualification,getFacMob,getFacemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculity);
        ed1=(EditText) findViewById(R.id.facname);
        ed2=(EditText) findViewById(R.id.dept);
        ed3=(EditText) findViewById(R.id.qualification);
        ed4=(EditText) findViewById(R.id.mobnmumfac);
        ed5=(EditText) findViewById(R.id.emailfac);
        b1=(AppCompatButton)  findViewById(R.id.facsubbut);
        b2=(AppCompatButton) findViewById(R.id.backbut);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),DashBoardActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFaculityName=ed1.getText().toString();
                getDepartment=ed2.getText().toString();
                getQualification=ed3.getText().toString();
                getFacMob=ed4.getText().toString();
                getFacemail=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getFaculityName, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getDepartment, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getQualification, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getFacMob, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getFacemail, Toast.LENGTH_LONG).show();
            }
        });
}
}