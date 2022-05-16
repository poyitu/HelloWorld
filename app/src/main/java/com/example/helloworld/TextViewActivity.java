package com.example.helloworld;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewActivity extends AppCompatActivity {
    private TextView textView4, textView5, textView6, textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        textView4 = findViewById(R.id.tv_4);
        textView5 = findViewById(R.id.tv_5);
        textView6 = findViewById(R.id.tv_6);
        textView7 = findViewById(R.id.tv_7);
        textView4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        textView4.getPaint().setAntiAlias(true);//去除锯齿
        textView5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        textView6.setText(Html.fromHtml("<u>秦哈哈在奔跑</u>"));
        textView7.setSelected(true);
    }
}