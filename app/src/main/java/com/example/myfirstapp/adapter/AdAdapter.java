package com.example.myfirstapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class AdAdapter extends PagerAdapter {

    private Context context;
    private List<ImageView> imageLists;

    public AdAdapter (Context context, List<ImageView> images) {
        this.context = context;
        this.imageLists = images;
    }

    @Override
    public int getCount() {
        return null != imageLists ? imageLists.size() : 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(imageLists.get(position));
        return imageLists.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(imageLists.get(position));
    }
}
