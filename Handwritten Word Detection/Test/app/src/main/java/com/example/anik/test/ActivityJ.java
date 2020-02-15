package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityJ extends AppCompatActivity {

    EditText e10;
    Button Ok10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j);
        e10=(EditText)findViewById(R.id.e10);

        Ok10 = (Button) findViewById(R.id.Ok10) ;

        Ok10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e10.getText().toString().equals("J"))
                {
                    e10.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityJ.this, ActivityWaitingJ.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityJ.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}