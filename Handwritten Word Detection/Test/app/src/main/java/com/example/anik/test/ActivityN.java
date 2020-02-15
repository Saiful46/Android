package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityN extends AppCompatActivity {

    EditText e14;
    Button Ok14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n);

        e14=(EditText)findViewById(R.id.e14);

        Ok14 = (Button) findViewById(R.id.Ok14) ;

        Ok14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e14.getText().toString().equals("N"))
                {
                    e14.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityN.this, ActivityWaitingN.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityN.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
