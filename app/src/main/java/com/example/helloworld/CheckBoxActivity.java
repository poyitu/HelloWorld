package com.example.helloworld;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Poyitu
 */
public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox checkBox5;
    private CheckBox checkBox6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkBox5 = findViewById(R.id.cd_5);
        checkBox6 = findViewById(R.id.cd_6);
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked ? "5选中" : "5未选中", Toast.LENGTH_SHORT).show();
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked ? "6选中" : "6未选中", Toast.LENGTH_SHORT).show();
            }
        });
    }
}