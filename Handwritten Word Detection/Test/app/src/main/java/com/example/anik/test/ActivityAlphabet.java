package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityAlphabet extends AppCompatActivity {

    EditText e1;
    Button Ok1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        e1=(EditText)findViewById(R.id.e1);

        Ok1 = (Button) findViewById(R.id.Ok1) ;

        Ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("A"))
                {
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    e1.setText("");

                    Intent intent = new Intent(ActivityAlphabet.this, ActivityWaiting.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityAlphabet.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
