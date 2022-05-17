package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Administrator
 */
public class LifeCycleActivity extends AppCompatActivity {
    private static final String TAG = "MyTag";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.d(TAG, "onCreate: begin");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: begin");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: begin");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: begin");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: begin");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: begin");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: begin");
    }
}
