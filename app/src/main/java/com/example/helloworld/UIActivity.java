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
                    // ?????????TextView??????
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    // ?????????button??????
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_eidtText:
                    // ????????? eidtText ??????
                    intent = new Intent(UIActivity.this, EidtTextActivity3.class);
                    break;
                case R.id.btn_RadioButton:
                    // ????????? RadioButton ??????
                    intent = new Intent(UIActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    // ????????? checkbox ??????
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    // ????????? imageview ??????
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;

                case R.id.btn_listview:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //????????? gridview ??????
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_webview:
                    //????????? webview ??????
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    //????????? toast ??????
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    //????????? dialog ??????
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;

                case R.id.btn_lifecycyle:
                    //????????? lifecycyle ??????
                    intent = new Intent(UIActivity.this, LifeCycleActivity.class);
                    break;

                case R.id.btn_jump:
                    //????????? jump ??????
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;
                case R.id.btn_fragment:
                    //????????? frament ????????????
                    intent = new Intent(UIActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_event:
                    //????????? frament ????????????
                    intent = new Intent(UIActivity.this, EventActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}

