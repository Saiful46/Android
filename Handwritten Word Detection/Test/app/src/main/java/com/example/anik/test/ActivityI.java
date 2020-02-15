package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityI extends AppCompatActivity {

    EditText e9;
    Button Ok9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i);
        e9=(EditText)findViewById(R.id.e9);

        Ok9 = (Button) findViewById(R.id.Ok9) ;

        Ok9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e9.getText().toString().equals("I"))
                {
                    e9.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityI.this, ActivityWaitingI.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityI.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}