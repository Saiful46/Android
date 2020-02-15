package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityWord extends AppCompatActivity {

    EditText w1;
    Button Okw1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        w1=(EditText)findViewById(R.id.w1);

        Okw1 = (Button) findViewById(R.id.Okw1) ;

        Okw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w1.getText().toString().equals("Apple"))
                {
                    w1.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityWord.this, ActivityBall.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityWord.this, "Please Input Valid Word", Toast.LENGTH_SHORT).show();
            }
        });
    }
}