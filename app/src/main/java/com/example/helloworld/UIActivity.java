package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.fragment.ContainerActivity;
import com.example.helloworld.gridview.GridViewActivity;
import com.example.helloworld.jump.AActivity;
import com.example.helloworld.listview.ListViewActivity;

public class UIActivity extends AppCompatActivity {
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
    private Button btn_dialog;
    private Button btn_lifecycyle;
    private Button btn_jump;
    private Button btn_fragment;
    private Button btn_event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
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
        btn_dialog = findViewById(R.id.btn_dialog);
        btn_lifecycyle = findViewById(R.id.btn_lifecycyle);
        btn_jump = findViewById(R.id.btn_jump);
        btn_fragment = findViewById(R.id.btn_fragment);
        btn_event = findViewById(R.id.btn_event);
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
        btn_dialog.setOnClickListener(onClick);
        btn_lifecycyle.setOnClickListener(onClick);
        btn_jump.setOnClickListener(onClick);
        btn_fragment.setOnClickListener(onClick);
        btn_event.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_textview:
                    // 跳转到TextView页面
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    // 跳转到button页面
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_eidtText:
                    // 跳转到 eidtText 页面
                    intent = new Intent(UIActivity.this, EidtTextActivity3.class);
                    break;
                case R.id.btn_RadioButton:
                    // 跳转到 RadioButton 页面
                    intent = new Intent(UIActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    // 跳转到 checkbox 页面
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    // 跳转到 imageview 页面
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;

                case R.id.btn_listview:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //跳转到 gridview 页面
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_webview:
                    //跳转到 webview 页面
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    //跳转到 toast 页面
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    //跳转到 dialog 页面
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;

                case R.id.btn_lifecycyle:
                    //跳转到 lifecycyle 页面
                    intent = new Intent(UIActivity.this, LifeCycleActivity.class);
                    break;

                case R.id.btn_jump:
                    //跳转到 jump 页面
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;
                case R.id.btn_fragment:
                    //跳转到 frament 演示页面
                    intent = new Intent(UIActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_event:
                    //跳转到 frament 演示页面
                    intent = new Intent(UIActivity.this, EventActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}

