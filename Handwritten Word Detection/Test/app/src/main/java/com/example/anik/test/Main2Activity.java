package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button Start, Continue, Rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Start = (Button) findViewById(R.id.Start) ;
        //Continue = (Button) findViewById(R.id.Continue) ;
        Rules = (Button) findViewById(R.id.Rules) ;

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, ActivityStart.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });

        Rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, ActivityRules.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });

    }
}
