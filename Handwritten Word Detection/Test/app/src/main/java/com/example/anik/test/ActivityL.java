package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityL extends AppCompatActivity {

    EditText e12;
    Button Ok12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l);
        e12=(EditText)findViewById(R.id.e12);

        Ok12 = (Button) findViewById(R.id.Ok12) ;

        Ok12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e12.getText().toString().equals("L"))
                {
                    e12.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityL.this, ActivityWaitingL.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityL.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}