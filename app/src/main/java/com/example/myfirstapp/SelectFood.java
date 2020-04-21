package com.example.myfirstapp;

import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SelectFood extends AppCompatActivity {
    private EditText mName;
    private RadioGroup typeGroup;
    private CheckBox suan, fish, hot;
    private SeekBar seekBar;
    private Button menu;
    private ToggleButton toggleBtn;
    private Integer price = 40;
    private List<Food> mFoods;
    private Person mPerson;
    private ImageView foodImage;
    private List<Food> mFoodResult;
    private boolean mIsFish;
    private boolean mIsSour;
    private boolean mIsHot;
    private Integer curIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_food);
        initFood();
        initProp();
        setLisener();
    }

    private void initFood() {
        // new 出来一个空的食物 list
        mFoods = new ArrayList<>();
        // 初始化添加所有的数据
        mFoods.add(new Food("麻辣香锅", 55, R.drawable.malaxiangguo, true, false, false));
        mFoods.add(new Food("水煮鱼", 48, R.drawable.shuizhuyu, true, true, false));
        mFoods.add(new Food("麻辣火锅", 80, R.drawable.malahuoguo, true, true, false));
        mFoods.add(new Food("清蒸鲈鱼", 68, R.drawable.qingzhengluyu, false, true, false));
        mFoods.add(new Food("桂林米粉", 15, R.drawable.guilin, false, false, false));
        mFoods.add(new Food("上汤娃娃菜", 28, R.drawable.wawacai, false, false, false));
        mFoods.add(new Food("红烧肉", 60, R.drawable.hongshaorou, false, false, false));
        mFoods.add(new Food("木须肉", 40, R.drawable.muxurou, false, false, false));
        mFoods.add(new Food("酸菜牛肉面", 35, R.drawable.suncainiuroumian, false, false, true));
        mFoods.add(new Food("西芹炒百合", 38, R.drawable.xiqin, false, false, false));
        mFoods.add(new Food("酸辣汤", 40, R.drawable.suanlatang, true, false, true));
        System.out.println(mFoods);
        mPerson = new Person();
        mFoodResult = new ArrayList<>();
    }

    private void initProp() {
        mName = findViewById(R.id.name);
        typeGroup = findViewById(R.id.radioType);
        suan = findViewById(R.id.suan);
        fish = findViewById(R.id.fish);
        hot = findViewById(R.id.hot);
        seekBar = findViewById(R.id.seekBar);
        menu = findViewById(R.id.newMenu);
        toggleBtn = findViewById(R.id.getNext);
        foodImage = findViewById(R.id.foodImage);
    }

    private void setLisener() {
        // 设置性别监听
        typeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.men:
                        mPerson.setSex("男");
                        break;
                    case R.id.women:
                        mPerson.setSex("女");
                        break;
                    default:
                        mPerson.setSex("男");
                        break;
                }
            }
        });
        // 设置口味监听
        suan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsSour = isChecked;
            }
        });
        fish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsFish = isChecked;
            }
        });
        hot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mIsHot = isChecked;
            }
        });

        // 设置价格seekerBar 监听
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                price = seekBar.getProgress();
                Toast.makeText(SelectFood.this, "价格： " + price, Toast.LENGTH_SHORT).show();
            }
        });

        // 生成菜单按钮监听
        menu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                search();
            }
        });

        // 下一个菜单切换监听

        toggleBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(toggleBtn.isChecked()){
                    curIndex ++;
                    if(curIndex < mFoodResult.size()){
                        foodImage.setImageResource(mFoodResult.get(curIndex).getPic());
                    } else {
                        Toast.makeText(SelectFood.this, "没有啦", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    if (curIndex < mFoodResult.size()){
                        Toast.makeText(SelectFood.this, "菜名： " + mFoodResult.get(curIndex).getName(), Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(SelectFood.this, "没有啦", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void search(){
        if (mFoodResult == null){
            mFoodResult = new ArrayList<>();
        }
        mFoodResult.clear();
        curIndex = 0;
        for (int i = 0; i < mFoods.size();i++){
            Food food = mFoods.get(i);
            System.out.println("111111111111");
            System.out.println(food.getPrice());
            if(food != null){
                if(food.getPrice() < price && (food.getHot() == mIsHot || food.getSuan() == mIsSour || food.getFish() == mIsFish)){
                    mFoodResult.add(food);
                }
            }

        }
        // 先显示第一张图片
        if(curIndex < mFoodResult.size()){
            foodImage.setImageResource(mFoodResult.get(curIndex).getPic());
        } else {
            foodImage.setImageResource(R.drawable.ic_launcher_foreground);
        }
    }
}
