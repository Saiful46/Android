package com.example.anik.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.os.Handler;
import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
  // private static boolean splashLoaded = false;
    private static  final String TAG = "mytag";

    static {
        if (OpenCVLoader.initDebug()){
            Log.d(TAG, "OpenCV Not loaded");
        }
        else{
            Log.d(TAG, "OpenCV loaded successfully installd");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);   // set the duration of splash screen
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
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



   /* @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!splashLoaded) {
            setContentView(R.layout.activity_main);
            int secondsDelayed = 1;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                }
            }, secondsDelayed = 3000);

            splashLoaded = true;
        }
        else {
            Intent goToMain2Activity = new Intent(MainActivity.this, Main2Activity.class);
            goToMain2Activity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToMain2Activity);
        }
    }*/





}
