package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton bd1,bd2;
String getName,getmob,getemailid,getpass,getcpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.mobnum);
        ed3=(EditText) findViewById(R.id.emailid);
        ed4=(EditText) findViewById(R.id.passreg);
        ed5=(EditText) findViewById(R.id.cpass);
        bd1=(AppCompatButton) findViewById(R.id.reg1but);
        bd2=(AppCompatButton) findViewById(R.id.backbut);

        bd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        bd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getmob=ed2.getText().toString();
                getemailid=ed3.getText().toString();
                getpass=ed4.getText().toString();
                getcpass=ed5.getText().toString();
                if (getpass.equals(getcpass))
                {
                    Toast.makeText(getApplicationContext(),getName, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getmob, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getemailid, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getpass, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),getcpass, Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
