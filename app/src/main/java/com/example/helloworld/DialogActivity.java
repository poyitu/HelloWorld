package com.example.helloworld;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworld.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {
    private Button btn_dialog1;
    private Button btn_dialog2;
    private Button btn_dialog3;
    private Button btn_dialog4;
    private Button btn_dialog5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        btn_dialog1 = findViewById(R.id.btn_dialog1);
        btn_dialog2 = findViewById(R.id.btn_dialog2);
        btn_dialog3 = findViewById(R.id.btn_dialog3);
        btn_dialog4 = findViewById(R.id.btn_dialog4);
        btn_dialog5 = findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        btn_dialog1.setOnClickListener(onClick);
        btn_dialog2.setOnClickListener(onClick);
        btn_dialog3.setOnClickListener(onClick);
        btn_dialog4.setOnClickListener(onClick);
        btn_dialog5.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
            switch (v.getId()) {
                case R.id.btn_dialog1:

                    builder.setTitle("请回答").setMessage("你觉得课程如何？")
                            .setIcon(R.drawable.xiajiantou)
                            .setPositiveButton("棒", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    ToastUtil.showMsg(DialogActivity.this, "你很诚实");
                                }
                            }).setNeutralButton("还行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, "你在瞅瞅~");
                        }
                    }).setNegativeButton("不好", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, "睁眼说瞎话");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog2:
                    final String[] array = {"男", "女"};
                    builder.setTitle("选择性别").setItems(array, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, array[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    final String[] array3 = {"男", "女"};
                    builder.setTitle("请选择性别")
                            .setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    ToastUtil.showMsg(DialogActivity.this, array3[which]);
                                    dialog.dismiss();
                                }
                            }).setCancelable(false)
                            .show();
                    break;
                case R.id.btn_dialog4:
                    final String[] array4 = {"唱", "跳", "rap", "篮球"};
                    boolean[] isselected = {false, false, false, true};
                    builder.setTitle("选择兴趣")
                            .setMultiChoiceItems(array4, isselected, new DialogInterface.OnMultiChoiceClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                    ToastUtil.showMsg(DialogActivity.this, array4[which] + ":" + isChecked);
                                }
                            }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //
                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //
                        }
                    }).show();
                    break;
                case R.id.btn_dialog5:
                    View view = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog, null);
                    //用填充好的view才能去查找
                    EditText etUsername = view.findViewById(R.id.et_username);
                    EditText Password = view.findViewById(R.id.et_password);
                    Button Login = view.findViewById(R.id.btn_login);
                    Login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ToastUtil.showMsg(DialogActivity.this, etUsername.getText().toString());
                        }
                    });
                    builder.setTitle("请先登录").setView(view).show();
                    break;
                default:
                    break;
            }
        }
    }
}