package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityY extends AppCompatActivity {


    EditText e25;
    Button Ok25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y);

        e25=(EditText)findViewById(R.id.e25);

        Ok25 = (Button) findViewById(R.id.Ok25) ;

        Ok25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e25.getText().toString().equals("Y"))
                {
                    e25.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityY.this, ActivityWaitingY.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityY.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
