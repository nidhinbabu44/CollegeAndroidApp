

package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DashBoardActivity extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5,b6;
SharedPreferences myPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        b1=(AppCompatButton) findViewById(R.id.stubut);
        b2=(AppCompatButton) findViewById(R.id.facbut);
        b3=(AppCompatButton) findViewById(R.id.searchstubut);
        b4=(AppCompatButton) findViewById(R.id.searchfacbut);
        b5=(AppCompatButton) findViewById(R.id.viewwebbut);
        b6=(AppCompatButton) findViewById(R.id.logout);
        myPreference=getSharedPreferences("login",MODE_PRIVATE);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myedit=myPreference.edit();
                myedit.clear();
                myedit.commit();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ViewWebsite.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchFaculity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchStudent.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddFaculity.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddStudent.class);
                startActivity(i);
            }
        });
    }
}