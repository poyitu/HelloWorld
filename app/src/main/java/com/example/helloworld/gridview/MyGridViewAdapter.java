package com.example.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

/**
 * @author Administrator
 */
public class MyGridViewAdapter extends BaseAdapter {
    private Context mcontext;
    private LayoutInflater mlayoutInflater;

    public MyGridViewAdapter(Context context) {
        mcontext = context;
        mlayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mlayoutInflater.inflate(R.layout.layout_grid_item, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_grid);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvTitle.setText("花");
        Glide.with(mcontext).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fitbbs%2F2006%2F19%2Fc3%2F215378808_1592525684633_mthumb.jpg&refer=http%3A%2F%2Fimg.pconline.com.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1655275438&t=98e001af7f7e8900b73d609e6e033ff3").into(holder.imageView);

        return convertView;
    }
}
