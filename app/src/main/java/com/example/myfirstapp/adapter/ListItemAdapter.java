package com.example.myfirstapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.example.myfirstapp.R;
import com.example.myfirstapp.entity.ListData;

import java.util.ArrayList;
import java.util.List;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemViewHolder> {

    private static int IVHEIGHT = 300;
    private final Context context;
    private List<ListData> list;
    private RecyclerView recyclerView;
    private int curPosition = -1;

    public ListItemAdapter(Context context, RecyclerView recyclerView){
        this.context = context;
        this.list = new ArrayList<>();
        this.recyclerView = recyclerView;
    }
    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListItemViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_fragment,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder holder, int position) {
        ListData listItem = list.get(position);
        holder.iv.setImageResource(listItem.getImage());
        holder.tv.setText(listItem.getTitle());

        if (recyclerView.getLayoutManager().getClass() == StaggeredGridLayoutManager.class){
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,setRandomHeight());
            holder.listItem.setOrientation(LinearLayout.VERTICAL);
            holder.iv.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            holder.iv.getLayoutParams().height = IVHEIGHT;
            holder.tv.setLayoutParams(params);
        } else {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
            holder.listItem.setOrientation(LinearLayout.HORIZONTAL);
            holder.iv.getLayoutParams().width = 240;
            holder.iv.getLayoutParams().height = 240;
            holder.tv.setLayoutParams(params);
        }
        //        改变ItemView背景颜色
        if (curPosition == position) {
            holder.mItemView.setBackgroundColor(Color.RED);
        } else {
            holder.mItemView.setBackgroundColor(Color.parseColor("#A4D3EE"));
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // 添加list数据

    public void setListData(List<ListData> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    // 随机生成瀑布流item高度

    public int setRandomHeight(){
        return (int) (Math.random() * 1000);
    }

    // 插入一条数据

    public void insertOneData(int position, ListData oneData) {
        curPosition = position;
        list.add(position, oneData);
        notifyItemInserted(position);
        //        刷新ItemView
        notifyItemRangeChanged(position, list.size() - position);
    }

    /**
     * 删除一条数据
     * @param position
     */
    public void removeData (int position) {
        curPosition = -1;
        list.remove(position);
        notifyItemRemoved(position);

//        刷新ItemView
        notifyItemRangeChanged(position, list.size() - position);
    }
}
class ListItemViewHolder extends RecyclerView.ViewHolder {

    public LinearLayout listItem;
    public View mItemView;
    public ImageView iv;
    public TextView tv;

    public ListItemViewHolder(View itemView) {
        super(itemView);
        iv = itemView.findViewById(R.id.iv);
        tv = itemView.findViewById(R.id.tv);
        listItem = itemView.findViewById(R.id.list_item);
        mItemView = itemView;
    }
}