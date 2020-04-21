package com.example.myfirstapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class FragmentViewPager extends AppCompatActivity implements TabHost.TabContentFactory {

    private TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_view_pager);


        // 初始化总布局
        mTabHost = (TabHost) findViewById(R.id.tabHost);
        mTabHost.setup();

        int[] titleIds = {
                R.string.home,
                R.string.message,
                R.string.my
        };

        int[] iconIds = {
                R.drawable.main_tab_icon_home,
                R.drawable.main_tab_icon_message,
                R.drawable.main_tab_icon_my,
        };
        for (int i = 0; i < titleIds.length; i++) {
            View view = getLayoutInflater().inflate(R.layout.main_tab_layout,null,false);
            ImageView icon = (ImageView) view.findViewById(R.id.main_tab_icon);
            TextView text = (TextView) view.findViewById(R.id.main_tab_txt);
            View tab = view.findViewById(R.id.tab_bg);
            icon.setImageResource(iconIds[i]);
            text.setText(titleIds[i]);
            tab.setBackgroundColor(getResources().getColor(R.color.white));
            mTabHost.addTab(
                    mTabHost.newTabSpec(getString(titleIds[i]))
                    .setIndicator(view)
                    .setContent(this)
            );
        }

        // 三个Fragment 数组
        final Fragment[] fragments = new Fragment[] {
            TextFragment.newInstance("首页"),
            TextFragment.newInstance("消息"),
            TextFragment.newInstance("我的")
//            TextFragment.newInstance(String.valueOf(R.mipmap.diglett)),
//            TextFragment.newInstance(String.valueOf(R.mipmap.ic_launcher_round)),
//            TextFragment.newInstance(String.valueOf(R.mipmap.ic_launcher))
        };

        final ViewPager viewPagerBox = (ViewPager) findViewById(R.id.viewPagerCont);
        viewPagerBox.setOffscreenPageLimit(fragments.length);
        viewPagerBox.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments[position];
            }

            @Override
            public int getCount() {
                return fragments.length;
            }
        });

        viewPagerBox.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (mTabHost != null){
                    mTabHost.setCurrentTab(position);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if (mTabHost != null){
                    int position = mTabHost.getCurrentTab();
                    viewPagerBox.setCurrentItem(position);
                }
            }
        });

    }

    @Override
    public View createTabContent(String s) {
        View view = new View(this);
        view.setMinimumHeight(0);
        view.setMinimumWidth(0);
        return view;
    }
}
