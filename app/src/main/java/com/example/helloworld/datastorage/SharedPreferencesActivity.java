package com.example.helloworld.datastorage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class SharedPreferencesActivity extends AppCompatActivity {
    private EditText mEdName;
    private Button mBtnSave, mBtnShow;
    private TextView mTvContent;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        mEdName = findViewById(R.id.et_name);
        mBtnSave = findViewById(R.id.btn_save);
        mBtnShow = findViewById(R.id.btn_show);
        mTvContent = findViewById(R.id.tv_content);

        mSharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.putString("name", mEdName.getText().toString());
                mEditor.apply();//提交
            }
        });

        mBtnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvContent.setText(mSharedPreferences.getString("name", ""));
            }
        });
    }
}