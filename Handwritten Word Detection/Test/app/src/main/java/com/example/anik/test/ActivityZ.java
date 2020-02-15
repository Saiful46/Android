package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityZ extends AppCompatActivity {


    EditText e26;
    Button Ok26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z);

        e26=(EditText)findViewById(R.id.e26);

        Ok26 = (Button) findViewById(R.id.Ok26) ;

        Ok26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e26.getText().toString().equals("L"))
                {
                    e26.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityZ.this, ActivityCompleted.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityZ.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
