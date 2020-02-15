package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityF extends AppCompatActivity {

    EditText e6;
    Button Ok6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);
        e6=(EditText)findViewById(R.id.e6);

        Ok6 = (Button) findViewById(R.id.Ok6) ;

        Ok6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e6.getText().toString().equals("F"))
                {
                    e6.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityF.this, ActivityWaitingF.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityF.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}