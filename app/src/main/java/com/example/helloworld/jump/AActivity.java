package com.example.helloworld.jump;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

/**
 * @author Administrator
 */
public class AActivity extends AppCompatActivity {
    private Button mBtnJump;
    private Button mBtnJump2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("AActivity", "onCreate: begin");
        Log.d("AActivity", "taskid: " + getTaskId() + " ,hashCode:" + hashCode());
        logtaskName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mBtnJump = findViewById(R.id.jump);
        mBtnJump2 = findViewById(R.id.jump_2);
        mBtnJump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, AActivity.class);
                startActivity(intent);
            }
        });
        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式跳转1（通常使用）
                Intent intent = new Intent(AActivity.this, BActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("number", 88);
                bundle.putString("name", "波哥");
                intent.putExtras(bundle);
                startActivity(intent);
                //startActivityForResult(intent, 0);


                //显式跳转2
                //Intent intent = new Intent();
                //intent.setClass(AActivity.this, BActivity.class);
                //startActivity(intent);

                //显式跳转3
                //Intent intent = new Intent();
                //intent.setClassName(AActivity.this, "com.example.helloworld.jump.BActivity");
                //startActivity(intent);

                //隐式跳转
                //Intent intent = new Intent();
                //intent.setAction("com.iweb.test");
                //startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(AActivity.this, data.getExtras().getString("title"), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("AActivity", "onNewIntent: begin");
        Log.d("AActivity", "taskid: " + getTaskId() + " ,hashCode:" + hashCode());
        logtaskName();
    }

    private void logtaskName() {
        try {
            ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.d("AActivity", info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
