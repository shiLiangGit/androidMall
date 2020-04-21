package com.example.myfirstapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.example.myfirstapp.R;
import com.example.myfirstapp.Utils.DataUtils;
import com.example.myfirstapp.adapter.ListItemAdapter;
import com.example.myfirstapp.entity.ListData;

public class FindFragment extends Fragment {

    private RecyclerView listRecyclerView;
    private ListItemAdapter listItemAdapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.find_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // 添加数据按钮
        Button addBtn = getActivity().findViewById(R.id.addBtn);
        Button changeBtn = getView().findViewById(R.id.changeBtn);
        Button insertBtn = getActivity().findViewById(R.id.insertBtn);
        Button removeBtn = getActivity().findViewById(R.id.removeBtn);
        listRecyclerView = (RecyclerView) getView().findViewById(R.id.listRecycler);
        // 1、添加layoutManager
        linearLayoutManager = new LinearLayoutManager(getActivity());
        listRecyclerView.setLayoutManager(linearLayoutManager);
        // 2、添加adapter
        listItemAdapter = new ListItemAdapter(getActivity(), listRecyclerView);
        listRecyclerView.setAdapter(listItemAdapter);

        // 事件监听--添加数据
        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                listItemAdapter.setListData(DataUtils.getList());
            }
        });

        // 事件监听--改变layout布局

        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listRecyclerView.getLayoutManager().getClass() == LinearLayoutManager.class){
                    // 设置网格布局
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
                    listRecyclerView.setLayoutManager(gridLayoutManager);
                } else if (listRecyclerView.getLayoutManager().getClass() == GridLayoutManager.class){
                    // 设置瀑布流布局
                    StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                    listRecyclerView.setLayoutManager(staggeredGridLayoutManager);
                } else {
                    // 设置list布局
                    listRecyclerView.setLayoutManager(linearLayoutManager);
                }
            }
        });

        // 插入一条数据

        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListData oneData = new ListData(DataUtils.setListImg(1),"新插入的数据");
                listItemAdapter.insertOneData(1,oneData);
            }
        });

        // 删除一条数据
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listItemAdapter.removeData(1);
            }
        });

    }

}
