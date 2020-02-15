package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityH extends AppCompatActivity {

    EditText e8;
    Button Ok8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h);
        e8=(EditText)findViewById(R.id.e8);

        Ok8 = (Button) findViewById(R.id.Ok8) ;

        Ok8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e8.getText().toString().equals("H"))
                {
                    e8.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityH.this, ActivityWaitingH.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityH.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}