package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityLoad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        // For Loading Splash
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(4000);   // set the duration of splash screen
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(ActivityLoad.this, ActivityCongrates.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();

    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
