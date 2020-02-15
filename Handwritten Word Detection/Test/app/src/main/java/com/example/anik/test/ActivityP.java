package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityP extends AppCompatActivity {

    EditText e16;
    Button Ok16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);

        e16=(EditText)findViewById(R.id.e16);

        Ok16 = (Button) findViewById(R.id.Ok16) ;

        Ok16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e16.getText().toString().equals("P"))
                {
                    e16.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityP.this, ActivityWaitingP.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityP.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
