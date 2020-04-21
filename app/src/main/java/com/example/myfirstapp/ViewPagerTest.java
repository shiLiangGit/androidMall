package com.example.myfirstapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerTest extends AppCompatActivity {

    public static final int INIT_POSITION = 0;
    private ViewPager mViewPager;
    // first 、second 、third 轮播图
    private int[] mLayoutIds = {
            R.layout.view_first,
            R.layout.view_second,
            R.layout.view_third
    };

    private List<View> views;
    private ViewGroup mDotViewPager;
    private List<ImageView> mDotViews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_test);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mDotViewPager = findViewById(R.id.dotLayout);

        views = new ArrayList<>();
        // 组装数据
        for (int i = 0; i < mLayoutIds.length; i++) {
//            View view = getLayoutInflater().inflate(mLayoutIds[i], null);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.mipmap.ic_launcher);
            views.add(imageView);

            // 分页器
            ImageView dot = new ImageView(this);
            dot.setImageResource(R.mipmap.ic_launcher);
            dot.setMaxHeight(100);
            dot.setMaxWidth(100);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(80,80);
            layoutParams.leftMargin = 20;
            dot.setLayoutParams(layoutParams);
            dot.setEnabled(false);

            mDotViewPager.addView(dot);
            mDotViews.add(dot);
        }
        mViewPager.setAdapter(mPagerAdapter);
        mViewPager.setCurrentItem(INIT_POSITION);
        setCurDotView(INIT_POSITION);

//        设置viewPager 页面切换监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Toast.makeText(ViewPagerTest.this,"scrolled",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPageSelected(int position) {
                setCurDotView(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Toast.makeText(ViewPagerTest.this,"onPageScrollStateChanged",Toast.LENGTH_LONG).show();
            }
        });

    }

    private void setCurDotView(int position) {
        for (int i = 0; i < mDotViews.size(); i++) {
            mDotViews.get(i).setImageResource(position == i ? R.mipmap.diglett : R.mipmap.ic_launcher);
        }
    }

    // 设置Adapter
    PagerAdapter mPagerAdapter = new PagerAdapter() {
        @Override
        public int getCount() {
            return mLayoutIds.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View child = views.get(position);
            container.addView(child);
            return child;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView(views.get(position));
        }
    };
}
