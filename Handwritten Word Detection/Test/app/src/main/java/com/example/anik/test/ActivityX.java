package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityX extends AppCompatActivity {


    EditText e24;
    Button Ok24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x);

        e24=(EditText)findViewById(R.id.e24);

        Ok24 = (Button) findViewById(R.id.Ok24) ;

        Ok24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e24.getText().toString().equals("X"))
                {
                    e24.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityX.this, ActivityWaitingX.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityX.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
