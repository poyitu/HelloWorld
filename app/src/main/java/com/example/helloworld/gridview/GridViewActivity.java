package com.example.helloworld.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.R;

/**
 * @author Administrator
 */
public class GridViewActivity extends AppCompatActivity {
    private GridView mGridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        mGridView = findViewById(R.id.gv);
        mGridView.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this, "点击 pos" + position, Toast.LENGTH_SHORT).show();
            }
        });

        mGridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this, "长按 pos" + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
