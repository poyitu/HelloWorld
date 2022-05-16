package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.gridview.GridViewActivity;
import com.example.helloworld.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_listview;
    private Button btn_gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_listview = findViewById(R.id.btn_listview);
        btn_gridview = findViewById(R.id.btn_gridview);
        setListener();
    }

    private void setListener() {
        OnClick onClick = new OnClick();
        btn_listview.setOnClickListener(onClick);
        btn_gridview.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //跳转到 gridview 页面
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}

