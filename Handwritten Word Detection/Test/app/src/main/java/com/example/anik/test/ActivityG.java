package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityG extends AppCompatActivity {

    EditText e7;
    Button Ok7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g);
        e7=(EditText)findViewById(R.id.e7);

        Ok7 = (Button) findViewById(R.id.Ok7) ;

        Ok7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e7.getText().toString().equals("G"))
                {
                    e7.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityG.this, ActivityWaitingG.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityG.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}