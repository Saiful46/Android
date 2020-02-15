package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityO extends AppCompatActivity {

    EditText e15;
    Button Ok15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o);

        e15=(EditText)findViewById(R.id.e15);

        Ok15 = (Button) findViewById(R.id.Ok15) ;

        Ok15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e15.getText().toString().equals("O"))
                {
                    e15.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityO.this, ActivityWaitingO.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityO.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
