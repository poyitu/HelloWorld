package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_listview = findViewById(R.id.btn_listview);
        setListener();
    }

    private void setListener() {
        OnClick onClick = new OnClick();
        btn_listview.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}

