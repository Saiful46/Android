package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityRead extends AppCompatActivity {

    private Button Alphabet, Word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        Alphabet = (Button) findViewById(R.id.Alphabet) ;
        Word = (Button) findViewById(R.id.Word) ;


        Alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRead.this, ActivityAlphabet.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });

        Word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityRead.this, ActivityWord.class);
                startActivity(intent);
//                Toast.makeText(Main2Activity.this, "start", Toast.LENGTH_SHORT).show();
            }


        });




    }
}