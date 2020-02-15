package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityT extends AppCompatActivity {


    EditText e20;
    Button Ok20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t);

        e20=(EditText)findViewById(R.id.e20);

        Ok20 = (Button) findViewById(R.id.Ok20) ;

        Ok20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e20.getText().toString().equals("T"))
                {
                    e20.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityT.this, ActivityWaitingT.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityT.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
