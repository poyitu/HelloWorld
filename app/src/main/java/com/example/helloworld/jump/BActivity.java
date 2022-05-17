package com.example.helloworld.jump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

public class BActivity extends AppCompatActivity {
    private TextView mTvTitle;
    private Button btn_finish;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        mTvTitle = findViewById(R.id.tv_title);
        btn_finish = findViewById(R.id.btn_finish);
        Bundle bundle = getIntent().getExtras();

        mTvTitle.setText(bundle.getString("name") + bundle.getInt("number"));
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle bundle1 = new Bundle();
                bundle1.putString("title", "我回来了");
                intent.putExtras(bundle1);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }
}
