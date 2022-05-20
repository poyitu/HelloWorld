package com.example.helloworld.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.helloworld.R;

public class AFragment extends Fragment {
    private TextView mTvTitle;
    private Button btn_change;
    private BFragment bFragment;
    private Button btn_reset;
    private Button btn_message;
    private IonMessageClik ionMessageClik;

    public static AFragment newInstance(String title) {
        AFragment fragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        fragment.setArguments(bundle);//传递参数
        return fragment;
    }

    //设置布局文件
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTvTitle = view.findViewById(R.id.tv_title);
        btn_change = view.findViewById(R.id.btn_change);
        btn_reset = view.findViewById(R.id.btn_reset);
        btn_message = view.findViewById(R.id.btn_message);
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bFragment == null) {
                    bFragment = new BFragment();
                }
                assert getFragmentManager() != null;
                Fragment afragemnt = getFragmentManager().findFragmentByTag("a");
                if (afragemnt != null) {
                    getFragmentManager().beginTransaction().hide(afragemnt).add(R.id.fl_container, bFragment).addToBackStack(null).commitAllowingStateLoss();
                } else {
                    getFragmentManager().beginTransaction().add(R.id.fl_container, bFragment).addToBackStack(null).commitAllowingStateLoss();
                }

            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvTitle.setText("我是新的字");
            }
        });
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //((ContainerActivity) getActivity()).setData("秦哈哈");
                //((ContainerActivity) getActivity()).onClick("秦哈哈");
                ionMessageClik.onClick("秦哈哈");
            }
        });
        if (getArguments() != null) {
            mTvTitle.setText(getArguments().getString("title"));
        }
    }

    public interface IonMessageClik {
        void onClick(String text);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            ionMessageClik = (IonMessageClik) context;
        } catch (ClassCastException e) {
            throw new ClassCastException("Activity必须实现");
        }
    }
}
