package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.gridview.GridViewActivity;
import com.example.helloworld.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button button_textview;
    private Button button_btn;
    private Button button_eidtText;
    private Button btn_RadioButton;
    private Button btn_checkbox;
    private Button btn_imageview;

    private Button btn_listview;
    private Button btn_gridview;
    private Button btn_webview;
    private Button btn_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_textview = findViewById(R.id.btn_textview);
        button_btn = findViewById(R.id.btn_button);
        button_eidtText = findViewById(R.id.btn_eidtText);
        btn_RadioButton = findViewById(R.id.btn_RadioButton);
        btn_checkbox = findViewById(R.id.btn_checkbox);
        btn_imageview = findViewById(R.id.btn_imageview);

        btn_listview = findViewById(R.id.btn_listview);
        btn_gridview = findViewById(R.id.btn_gridview);
        btn_webview = findViewById(R.id.btn_webview);
        btn_toast = findViewById(R.id.btn_toast);
        setListener();
    }

    private void setListener() {
        OnClick onClick = new OnClick();
        button_textview.setOnClickListener(onClick);
        button_btn.setOnClickListener(onClick);
        button_eidtText.setOnClickListener(onClick);
        btn_RadioButton.setOnClickListener(onClick);
        btn_checkbox.setOnClickListener(onClick);
        btn_imageview.setOnClickListener(onClick);

        btn_listview.setOnClickListener(onClick);
        btn_gridview.setOnClickListener(onClick);
        btn_webview.setOnClickListener(onClick);
        btn_toast.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_textview:
                    // 跳转到TextView页面
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    // 跳转到button页面
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_eidtText:
                    // 跳转到 eidtText 页面
                    intent = new Intent(MainActivity.this, EidtTextActivity3.class);
                    break;
                case R.id.btn_RadioButton:
                    // 跳转到 RadioButton 页面
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    // 跳转到 checkbox 页面
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    // 跳转到 imageview 页面
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;

                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //跳转到 gridview 页面
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_webview:
                    //跳转到 webview 页面
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    //跳转到 toast 页面
                    intent = new Intent(MainActivity.this, ToastActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}

