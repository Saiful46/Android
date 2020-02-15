package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityD extends AppCompatActivity {

    EditText e4;
    Button Ok4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        e4=(EditText)findViewById(R.id.e4);

        Ok4 = (Button) findViewById(R.id.Ok4) ;

        Ok4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e4.getText().toString().equals("D"))
                {
                    e4.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityD.this, ActivityWaitingD.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityD.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}