package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityK extends AppCompatActivity {

    EditText e11;
    Button Ok11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k);
        e11=(EditText)findViewById(R.id.e11);

        Ok11 = (Button) findViewById(R.id.Ok11) ;

        Ok11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e11.getText().toString().equals("K"))
                {
                    e11.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityK.this, ActivityWaitingK.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityK.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}