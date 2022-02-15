package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1, e2;
AppCompatButton b1, b2;
String getEmail, getPassword, preferenceValue ;
SharedPreferences myPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.email);
        e2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.logbut);
        b2=(AppCompatButton) findViewById(R.id.regbut);
        myPreference=getSharedPreferences("login",MODE_PRIVATE);
        preferenceValue=myPreference.getString("email",null);

        if (preferenceValue!=null)
        {
            Intent i=new Intent(getApplicationContext(),DashBoardActivity.class);
            startActivity(i);
        }
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Register_Activity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               getEmail=e1.getText().toString();
               getPassword=e2.getText().toString();
                if(getEmail.equals("admin@gmail.com")&&getPassword.equals("12345"))
                {
                    SharedPreferences.Editor myEdit=myPreference.edit();
                    myEdit.putString("email",getEmail);
                    myEdit.commit();

                    Intent i=new Intent(getApplicationContext(),DashBoardActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Credinentals", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}