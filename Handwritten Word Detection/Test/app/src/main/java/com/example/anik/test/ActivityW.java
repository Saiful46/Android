package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityW extends AppCompatActivity {


    EditText e23;
    Button Ok23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w);

        e23=(EditText)findViewById(R.id.e23);

        Ok23 = (Button) findViewById(R.id.Ok23) ;

        Ok23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e23.getText().toString().equals("W"))
                {
                    e23.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityW.this, ActivityWaitingW.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityW.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
