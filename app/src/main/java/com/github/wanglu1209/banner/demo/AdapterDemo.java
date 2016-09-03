package com.github.wanglu1209.banner.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.github.wanglu1209.banner.BannerPagerAdapter;
import com.github.wanglu1209.banner.R;

import java.util.List;

/**
 * Created by WangLu on 16/9/1.
 */
public class AdapterDemo extends BannerPagerAdapter {

    private Context mContext;
    private List<Integer> data;

    public AdapterDemo(Context context, List data) {
        super(context, data);
        mContext = context;
        this.data = data;
    }

    @Override
    public View setView(int position) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.test, null);
        ImageView iv = (ImageView) v.findViewById(R.id.iv);
        iv.setImageResource(data.get(position));
        return v;
    }
}