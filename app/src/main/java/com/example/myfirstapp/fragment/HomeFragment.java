package com.example.myfirstapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.example.myfirstapp.NewsListView;
import com.example.myfirstapp.R;
import com.example.myfirstapp.Utils.DataUtils;
import com.example.myfirstapp.adapter.AdAdapter;
import com.example.myfirstapp.adapter.MenuViewAdapter;

import java.util.List;

public class HomeFragment extends Fragment {
    protected  int[] icons={R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2,R.mipmap.header_pic_ad1};
    //菜单图标
    protected  int [] menuIons={R.mipmap.menu_airport,R.mipmap.menu_car
            ,R.mipmap.menu_course,R.mipmap.menu_hatol,
            R.mipmap.menu_nearby,R.mipmap.me_menu_go,
            R.mipmap.menu_ticket,R.mipmap.menu_train};
    protected  String [] menus;

    // 出行菜单图标
    protected  int [] menuSecondIons={R.mipmap.menu_second_airport,R.mipmap.menu_second_play,R.mipmap.menu_second_quan};
    protected  String [] menusSecond;

    private ViewPager mAdAdapter;
    private View newsIcon;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        menus=this.getActivity().getResources().getStringArray(R.array.main_menu);
        menusSecond=this.getActivity().getResources().getStringArray(R.array.second_menu);

        newsIcon = this.getActivity().findViewById(R.id.newsIcon);
        newsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), NewsListView.class);
                startActivity(intent);
            }
        });

        // 头部轮播广告
        mAdAdapter = (ViewPager) getView().findViewById(R.id.advertisePager);
        AdAdapter adAdapter = new AdAdapter(getActivity(), DataUtils.getAdImagesList(getActivity(), icons));
        mAdAdapter.setAdapter(adAdapter);

        // 菜单模块
        RecyclerView menuRecycleView = (RecyclerView) getView().findViewById(R.id.recycleview_main_menu);
        menuRecycleView.setLayoutManager(new GridLayoutManager(getActivity(),4));
        MenuViewAdapter menuAdapter = new MenuViewAdapter(getActivity(), DataUtils.getMenus(menuIons,menus));
        menuRecycleView.setAdapter(menuAdapter);

        // 出行菜单模块
        RecyclerView menuRecycleSecondView = (RecyclerView) getView().findViewById(R.id.recycleview_second_menu);
        menuRecycleSecondView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        MenuViewAdapter menuSecondAdapter = new MenuViewAdapter(getActivity(), DataUtils.getMenus(menuSecondIons,menusSecond));
        menuRecycleSecondView.setAdapter(menuSecondAdapter);

    }
}
