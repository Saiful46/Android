package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityWrite extends AppCompatActivity {

    private Button Alphabet1, Word1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        Alphabet1 = (Button) findViewById(R.id.Alphabet1) ;
        Word1 = (Button) findViewById(R.id.Word1) ;


        Alphabet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityWrite.this, ActivityScrollW.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });

        Word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityWrite.this, ActivityWordW.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });




    }
}