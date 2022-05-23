package com.example.helloworld.datastorage;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity extends AppCompatActivity {
    private EditText mEdName;
    private Button mBtnSave, mBtnShow;
    private TextView mTvContent;
    private final String mFileName = "text.txt";
    //private SharedPreferences mSharedPreferences;
    //private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        mEdName = findViewById(R.id.et_name);
        mBtnSave = findViewById(R.id.btn_save);
        mBtnShow = findViewById(R.id.btn_show);
        mTvContent = findViewById(R.id.tv_content);

        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(mEdName.getText().toString());
            }
        });
        mBtnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvContent.setText(read());
            }
        });
    }

    private void save(String content) {
        FileOutputStream fileOutputStream = null;
        try {
            //fileOutputStream = openFileOutput(mFileName, MODE_PRIVATE);
            File dir = new File(Environment.getExternalStorageDirectory(), "bobo");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File file = new File(dir, mFileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String read() {
        FileInputStream fileInputStream = null;
        try {
            //fileInputStream = openFileInput(mFileName);
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "bobo", mFileName);
            fileInputStream = new FileInputStream(file);

            byte[] buffe = new byte[1024];
            StringBuilder sb = new StringBuilder("");
            int len = 0;
            while ((len = fileInputStream.read(buffe)) > 0) {
                sb.append(new String(buffe, 0, len));
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}