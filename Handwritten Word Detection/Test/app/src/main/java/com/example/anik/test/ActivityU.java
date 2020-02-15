package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityU extends AppCompatActivity {

    EditText e21;
    Button Ok21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u);

        e21=(EditText)findViewById(R.id.e21);

        Ok21 = (Button) findViewById(R.id.Ok21) ;

        Ok21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e21.getText().toString().equals("U"))
                {
                    e21.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityU.this, ActivityWaitingU.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityU.this, "Please Input Valid Character", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
