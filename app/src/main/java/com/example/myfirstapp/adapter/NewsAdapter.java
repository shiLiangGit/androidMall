package com.example.myfirstapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.recyclerview.widget.ListAdapter;
import com.example.myfirstapp.NewsListView;
import com.example.myfirstapp.R;
import com.example.myfirstapp.entity.ListData;
import com.example.myfirstapp.entity.Menu;

import java.util.List;
import java.util.zip.Inflater;

public class NewsAdapter extends BaseAdapter {

    private Context context;
    private List<ListData> newsList;
    public NewsAdapter(Context context, List<ListData> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.news_item, parent, false);
        ImageView newsImg = convertView.findViewById(R.id.newsImg);
        TextView newsText = convertView.findViewById(R.id.newsText);
        newsImg.setImageResource(newsList.get(position).getImage());
        newsText.setText(newsList.get(position).getTitle());
        return convertView;
    }
}
