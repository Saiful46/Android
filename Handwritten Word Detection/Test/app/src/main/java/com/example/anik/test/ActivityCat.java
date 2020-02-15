package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityCat extends AppCompatActivity {

    EditText w3;
    Button Okw3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        w3=(EditText)findViewById(R.id.w3);

        Okw3 = (Button) findViewById(R.id.Okw3) ;

        Okw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w3.getText().toString().equals("Cat"))
                {
                    w3.setText("");
                    //Toast.makeText(ActivityAlphabet.this, "You Have Learned This Character", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityCat.this, ActivityCompleted.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(ActivityCat.this, "Please Input Valid Word", Toast.LENGTH_SHORT).show();
            }
        });
    }
}