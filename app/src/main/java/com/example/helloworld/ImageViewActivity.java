package com.example.helloworld;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

/**
 * @author Poyitu
 */
public class ImageViewActivity extends AppCompatActivity {
    private ImageView mIv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv2 = findViewById(R.id.iv_2);
        Glide.with(this).load("https://t14.baidu.com/it/u=3871151578,586465891&fm=179&app=42&size=w621&n=0&f=PNG?s=56F72C72CCB47E904B7DA3C40300A026&sec=1652720400&t=08bf8f1e85a3e2abbccac0174988d1ef").into(mIv2);
    }
}