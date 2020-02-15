package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityS extends AppCompatActivity {

    EditText e19;
    Button Ok19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        e19=(EditText)findViewById(R.id.e19);

        Ok19 = (Button) findViewById(R.id.Ok19) ;

        Ok19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e19.getText().toString().equals("S"))
                {
                    e19.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityS.this, ActivityWaitingS.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityS.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
