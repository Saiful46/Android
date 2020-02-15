package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityR extends AppCompatActivity {

    EditText e18;
    Button Ok18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);

        e18=(EditText)findViewById(R.id.e18);

        Ok18 = (Button) findViewById(R.id.Ok18) ;

        Ok18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e18.getText().toString().equals("R"))
                {
                    e18.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityR.this, ActivityWaitingR.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityR.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
