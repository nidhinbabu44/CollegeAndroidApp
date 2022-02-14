package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchFaculity extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1, b2;
    String getFacName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_faculity);
        ed1=(EditText) findViewById(R.id.Facnamesearch);
        b1=(AppCompatButton) findViewById(R.id.searchfacbut1);
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
                getFacName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getFacName, Toast.LENGTH_SHORT).show();
            }
        });

    }
}