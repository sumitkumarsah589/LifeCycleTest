package com.demo.sumit.lifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    protected void onStart() {
        Log.d("life_cycle1: ","onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("life_cycle1: ","onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("life_cycle1: ","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("life_cycle1: ","onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("life_cycle1: ","onDestroy");
        super.onDestroy();
    }
}
