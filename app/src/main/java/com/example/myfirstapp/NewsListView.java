package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myfirstapp.Utils.DataUtils;
import com.example.myfirstapp.adapter.NewsAdapter;

import java.util.ArrayList;
import java.util.List;

public class NewsListView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);
        initNewsList();
    }

    private void initNewsList() {
        ListView newsListView = findViewById(R.id.newsList);
        // 模拟adapter数据
        List newsListsArr = DataUtils.getList();

        // 实例化adapter
        NewsAdapter newsAdapter = new NewsAdapter(this, newsListsArr);


        newsListView.setAdapter(newsAdapter);
    }
}
