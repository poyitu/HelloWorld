package com.example.helloworld.fragment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;


public class ContainerActivity extends AppCompatActivity implements AFragment.IonMessageClik {
    private AFragment aFragment;
    private BFragment bFragment;
    private TextView mTextView;
    //private Button btn_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        mTextView = findViewById(R.id.tv_title);

        aFragment = AFragment.newInstance("哈哈哈");
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, aFragment, "a").commitAllowingStateLoss();

    }

    public void setData(String msg) {
        mTextView.setText(msg);
    }


    @Override
    public void onClick(String text) {
        mTextView.setText(text);
    }
}