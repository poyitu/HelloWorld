package com.example.helloworld;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Poyitu
 */
public class RadioButtonActivity extends AppCompatActivity {
    private RadioGroup rg_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        rg_1 = findViewById(R.id.rg_2);
        rg_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radiobutton = group.findViewById(checkedId);
                Toast.makeText(RadioButtonActivity.this, radiobutton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}