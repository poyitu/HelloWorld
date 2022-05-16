package com.example.helloworld;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Administrator
 */
public class WebViewActivity extends AppCompatActivity {
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mWebView = findViewById(R.id.wv);
        //加载本地网页文件
        //mWebView.loadUrl("file:///android_asset/hello.html");

        //加载网络url
        //设置js可用
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://m.baidu.com");
    }
}