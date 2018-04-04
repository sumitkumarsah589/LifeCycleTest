package com.demo.sumit.lifecycletest;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("life_cycle: ","OnCreate");
        setContentView(R.layout.activity_main);
        //callThread();


    }


    public void clickIt(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }

    Handler handler = new Handler();

    private void callThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 3000);

            }
        };
        runnable.run();
    }

    @Override
    protected void onStart() {
        Log.d("life_cycle: ", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("life_cycle: ", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("life_cycle: ", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("life_cycle: ", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("life_cycle: ", "onDestroy");
        super.onDestroy();
    }
}