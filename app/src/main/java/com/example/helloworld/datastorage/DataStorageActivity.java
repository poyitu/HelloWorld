package com.example.helloworld.datastorage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class DataStorageActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnSharedPreferences;
    private Button file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage);
        mBtnSharedPreferences = findViewById(R.id.btn_SharedPreferences);
        file = findViewById(R.id.btn_file);
        mBtnSharedPreferences.setOnClickListener(this);
        file.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_SharedPreferences:
                intent = new Intent(DataStorageActivity.this, SharedPreferencesActivity.class);
                break;
            case R.id.btn_file:
                intent = new Intent(DataStorageActivity.this, FileActivity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}