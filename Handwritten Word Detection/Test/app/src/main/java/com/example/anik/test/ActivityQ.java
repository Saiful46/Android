package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityQ extends AppCompatActivity {

    EditText e17;
    Button Ok17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q);

        e17=(EditText)findViewById(R.id.e17);

        Ok17 = (Button) findViewById(R.id.Ok17) ;

        Ok17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e17.getText().toString().equals("Q"))
                {
                    e17.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityQ.this, ActivityWaitingQ.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityQ.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
