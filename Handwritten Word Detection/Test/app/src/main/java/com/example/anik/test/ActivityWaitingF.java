package com.example.anik.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityWaitingF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);

        // For Loading Splash
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);   // set the duration of splash screen
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(ActivityWaitingF.this, ActivityG.class);
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
