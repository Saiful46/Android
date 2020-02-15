package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityC extends AppCompatActivity {

    EditText e3;
    Button Ok3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        e3=(EditText)findViewById(R.id.e3);

        Ok3 = (Button) findViewById(R.id.Ok3) ;

        Ok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e3.getText().toString().equals("C"))
                {
                    e3.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityC.this, ActivityWaitingC.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityC.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

