package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityStart extends AppCompatActivity {

    private Button Read, Write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Read = (Button) findViewById(R.id.Read) ;
        Write = (Button) findViewById(R.id.Write) ;


        Read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStart.this, ActivityRead.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });

        Write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStart.this, ActivityWrite.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });




    }
}