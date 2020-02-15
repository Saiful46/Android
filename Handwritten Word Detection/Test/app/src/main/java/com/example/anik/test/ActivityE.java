package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityE extends AppCompatActivity {

    EditText e5;
    Button Ok5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);
        e5=(EditText)findViewById(R.id.e5);

        Ok5 = (Button) findViewById(R.id.Ok5) ;

        Ok5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e5.getText().toString().equals("E"))
                {
                    e5.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityE.this, ActivityWaitingE.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityE.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}