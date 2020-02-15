package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityV extends AppCompatActivity {


    EditText e22;
    Button Ok22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v);

        e22=(EditText)findViewById(R.id.e22);

        Ok22 = (Button) findViewById(R.id.Ok22) ;

        Ok22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e22.getText().toString().equals("V"))
                {
                    e22.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityV.this, ActivityWaitingV.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityV.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
