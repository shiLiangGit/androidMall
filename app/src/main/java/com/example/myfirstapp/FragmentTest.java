package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class FragmentTest extends AppCompatActivity implements FragmentItem.OnTitleClickListener {


    private TextView loadFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_test_activity);
        loadFragment = findViewById(R.id.loadFragment);
        loadFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FragmentTest.this, LoadFragmentActivity.class));
                Toast.makeText(FragmentTest.this,"Fragment测试",Toast.LENGTH_LONG).show();
            }
        });
        this.addLoadFragment();
    }

    /**
        1、动态添加fragment 并实现
        2、activity ---> fragment传值
     */
    public void addLoadFragment () {
    //  动态添加list fragment
        FragmentItem listFragment = FragmentItem.newInstance("list");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.listFragment,listFragment)
                .commit();
    //  动态添加detail fragment
        FragmentItem detailFragment = FragmentItem.newInstance("detail");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.detailFragment,detailFragment)
                .commit();

        listFragment.setOnTitleClickListener(this);
        detailFragment.setOnTitleClickListener(this);
    }


    /**
     *  1、fragment ---> activity 传值（通过回调方式---接口实现）
     */
    public void onClick (String title) {
        setTitle(title);
    }
}
