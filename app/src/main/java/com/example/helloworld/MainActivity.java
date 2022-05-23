package com.example.helloworld;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.helloworld.datastorage.DataStorageActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnUI;
    private Button btn_handler;
    private Button btn_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnUI = findViewById(R.id.btn_ui);
        btn_handler = findViewById(R.id.btn_handler);
        btn_data = findViewById(R.id.btn_data);
        OnClick onClick = new OnClick();
        mBtnUI.setOnClickListener(onClick);
        btn_handler.setOnClickListener(onClick);
        btn_data.setOnClickListener(onClick);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
    }

    class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_ui:
                    intent = new Intent(MainActivity.this, UIActivity.class);
                    break;
                case R.id.btn_handler:
                    intent = new Intent(MainActivity.this, HandlerActivity.class);
                    break;
                case R.id.btn_data:
                    intent = new Intent(MainActivity.this, DataStorageActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }

    }
}