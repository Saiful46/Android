package com.example.anik.test;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

public class ActivityWP extends AppCompatActivity {
    private PaintView paintView;
    Button Okwa1,clear1;
    TextView txtResult;
    public String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wp);
        paintView = (PaintView) findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
        txtResult=(TextView)findViewById(R.id.textview_result) ;
        clear1=(Button)findViewById(R.id.clear1);
        Okwa1=(Button)findViewById(R.id.Okwa1);
        clear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.clear();
            }
        });
        Okwa1.setOnClickListener(new View.OnClickListener()
        {

            // String myUser = String.valueOf("A"); // For single character
            // String myCap = "APPLE";          // For a string
            // String mySmal = "Apple";
            @Override
            public void onClick(View argO) {

                final LinearLayout layout= (LinearLayout) findViewById(R.id.linear1);

                layout.post(new Runnable() {
                    @Override
                    public void run() {
                        //TODO Auto generated method stub
                        Bitmap pic = takeScreenShot(layout);


                        try {
                            if(pic != null)
                            {

                                TextRecognizer textRecognizer = new TextRecognizer.Builder(getApplicationContext()).build();
                                if(!textRecognizer.isOperational())
                                    Log.e("ERROR","Detector dependencies are not yet available");
                                else{
                                    Frame frame = new Frame.Builder().setBitmap( pic).build();
                                    SparseArray<TextBlock> items = textRecognizer.detect(frame);
                                    StringBuilder stringBuilder = new StringBuilder();
                                    for(int i=0;i<items.size();++i)
                                    {
                                        TextBlock item = items.valueAt(i);
                                        stringBuilder.append(item.getValue());
                                        stringBuilder.append("\n");
                                    }
                                    txtResult.setText(stringBuilder.toString());
                                    Toast.makeText(ActivityWP.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
                                    str=stringBuilder.toString().trim();




                                   /*if (str.equals("ANK"))
                                    {
                                        Intent intent = new Intent(ActivityAlphabetW.this, ActivityAlphabetWB.class);
                                        startActivity(intent);
                                    }
                                    else
                                        Toast.makeText(ActivityAlphabetW.this, "Please Input Clear Character", Toast.LENGTH_SHORT).show();*/

                                }
                                // saveScreenShot(pic);
                                if (str.equals("P") || str.equals("p"))
                                {
                                    Intent intent = new Intent(ActivityWP.this, ActivityLoad.class);
                                    startActivity(intent);


                                }
                                else {
                                    Intent intent = new Intent(ActivityWP.this, ActivityLoad2.class);
                                    startActivity(intent);

                                    //           Toast.makeText(ActivityWW_A.this, "Please Input Clear Character", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }catch (Exception e)
                        {
                            e.printStackTrace();
                        }

                    }
                });
            }




        });



    }
    //Take Screenshot
    private Bitmap takeScreenShot(View v)
    {
        Bitmap screenShot=null;

        try{
            //GET WIDTH ANND HEIGHT OF VIEW
            int width=v.getMeasuredWidth();
            int height=v.getMeasuredHeight();

            screenShot=Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            //Draw to CANVAS
            Canvas c=new Canvas(screenShot);
            v.draw(c);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return screenShot;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.normal:
                paintView.normal();
                return true;
            case R.id.emboss:
                paintView.emboss();
                return true;
            case R.id.blur:
                paintView.blur();
                return true;
            case R.id.clear:
                paintView.clear();
                return true;
        }
        return super.onContextItemSelected(item);
    }

}