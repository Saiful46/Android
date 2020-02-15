package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityM extends AppCompatActivity {


    EditText e13;
    Button Ok13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);

        e13=(EditText)findViewById(R.id.e12);

        Ok13 = (Button) findViewById(R.id.Ok12) ;

        Ok13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e13.getText().toString().equals("M"))
                {
                    e13.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityM.this, ActivityWaitingM.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityM.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
