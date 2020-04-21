package com.example.myfirstapp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.myfirstapp.fragment.FindFragment;
import com.example.myfirstapp.fragment.HomeFragment;
import com.example.myfirstapp.fragment.MyFragment;

public class Mall extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mHome;
    private LinearLayout mFind;
    private LinearLayout mMy;
    private HomeFragment homeFragment = new HomeFragment();
    private FindFragment findFragment = new FindFragment();
    private MyFragment myFragment = new MyFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        initView();

        // 动态添加首页、发现、我的Fragment页面
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.tabContainer,homeFragment)
                .add(R.id.tabContainer,findFragment)
                .hide(findFragment)
                .add(R.id.tabContainer,myFragment)
                .hide(myFragment)
                .commit();
    }

    private void initView() {
        mHome = (LinearLayout) findViewById(R.id.tabHome);
        mFind = (LinearLayout) findViewById(R.id.tabFind);
        mMy = (LinearLayout) findViewById(R.id.tabMy);

        mHome.setOnClickListener(this);
        mFind.setOnClickListener(this);
        mMy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tabHome:
                getSupportFragmentManager()
                        .beginTransaction()
                        .show(homeFragment)
                        .hide(findFragment)
                        .hide(myFragment)
                        .commit();
                break;
            case R.id.tabFind:
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(homeFragment)
                        .show(findFragment)
                        .hide(myFragment)
                        .commit();
                break;
            case R.id.tabMy:
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(homeFragment)
                        .hide(findFragment)
                        .show(myFragment)
                        .commit();
                break;
        }
    }
}
