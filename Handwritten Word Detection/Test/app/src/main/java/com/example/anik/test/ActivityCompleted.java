package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityCompleted extends AppCompatActivity {

    Button gb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);

        gb1 = (Button) findViewById(R.id.gb1) ;
        gb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(ActivityCompleted.this, ActivityStart.class);
                    startActivity(intent);

            }
        });
    }


}
