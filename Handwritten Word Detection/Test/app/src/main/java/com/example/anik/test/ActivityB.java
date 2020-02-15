package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    EditText e2;
    Button Ok2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        e2=(EditText)findViewById(R.id.e2);

        Ok2 = (Button) findViewById(R.id.Ok2) ;

        Ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e2.getText().toString().equals("B"))
                {
                    e2.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityB.this, ActivityWaitingB.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityB.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
