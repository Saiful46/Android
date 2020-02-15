package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityBall extends AppCompatActivity {

    EditText w2;
    Button Okw2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);
        w2=(EditText)findViewById(R.id.w2);

        Okw2 = (Button) findViewById(R.id.Okw2) ;

        Okw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w2.getText().toString().equals("Ball"))
                {
                    w2.setText("");
                    // /Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityBall.this, ActivityCat.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityBall.this, "Please Input Valid Word", Toast.LENGTH_SHORT).show();
            }
        });
    }
}