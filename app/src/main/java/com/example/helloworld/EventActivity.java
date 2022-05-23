package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.widget.MyButton;

public class EventActivity extends AppCompatActivity implements View.OnClickListener {
    private MyButton myButton;
    private Button btn_handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        myButton = findViewById(R.id.my_btn);
        btn_handler = findViewById(R.id.btn_handler);
        myButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.d("Listener", "onTouch: ");
                        break;
                    default:
                }
                return false;
            }
        });
        btn_handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventActivity.this, HandlerActivity.class);
                startActivity(intent);
            }
        });
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Listener", "onClick: ");
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("Activity", "onTouchEvent: ");
                break;
            default:
        }
        return false;
    }
}