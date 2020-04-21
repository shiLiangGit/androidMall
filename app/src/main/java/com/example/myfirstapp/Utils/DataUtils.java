package com.example.myfirstapp.Utils;

import android.content.Context;
import android.widget.ImageView;
import com.example.myfirstapp.R;
import com.example.myfirstapp.entity.ListData;
import com.example.myfirstapp.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    private static int anInt = 100;

    public static List<ImageView> getAdImagesList (Context context, int icons[]) {
        List<ImageView> images = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            ImageView icon = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER);
            icon.setImageResource(icons[i]);
            images.add(icon);
        }
        return images;
    }
    // 生成首页menus数组
    public static List<Menu> getMenus (int icons[], String menuNames[]) {
        List<Menu> menus = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            Menu menu = new Menu(icons[i],menuNames[i]);
            menus.add(menu);
        }
        return menus;
    }

    // 生成RecyclerView - LayoutManager 的list数据

    public static List<ListData> getList(){
        List<ListData> lists = new ArrayList<>();
        for (int i = 0; i < anInt; i++) {
            ListData listItem = new ListData(setListImg(i),"第" + i + "条消息");
            lists.add(listItem);
        }
        return lists;
    }

    public static int setListImg (int i) {
        int imgId = 0;
        switch (i % 5) {
            case 0 :
                imgId = R.mipmap.a;
                break;
            case 1 :
                imgId = R.mipmap.b;
                break;
            case 2 :
                imgId = R.mipmap.c;
                break;
            case 3 :
                imgId = R.mipmap.d;
                break;
            case 4 :
                imgId = R.mipmap.e;
                break;
            default:
                    break;
        }
        return imgId;
    }
}
