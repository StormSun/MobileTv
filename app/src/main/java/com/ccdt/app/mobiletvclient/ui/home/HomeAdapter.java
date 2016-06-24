package com.ccdt.app.mobiletvclient.ui.home;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ccdt.app.mobiletvclient.R;
import com.jude.rollviewpager.RollPagerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StormSun on 2016/6/23.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private String img0 = "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3425851328,2681317699&fm=21&gp=0.jpg";
    private String img1 = "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3700630188,1430779433&fm=21&gp=0.jpg";
    private String img2 ="https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4168762024,1922499492&fm=21&gp=0.jpg";
    private String img3 ="http://img2.imgtn.bdimg.com/it/u=41411327,1928322537&fm=21&gp=0.jpg";
    private List<String> imgs;
    private static final int VIEW_TYPE_ROLL = 0;
    private static final int VIEW_TYPE_COLUMN = 1;
    private static final int VIEW_TYPE_RECOMMEND = 2;
    private final LayoutInflater mInflater;

    public HomeAdapter(Context context){
        mInflater = LayoutInflater.from(context);

        imgs = new ArrayList<>();
        imgs.add(img0);
        imgs.add(img1);
        imgs.add(img2);
        imgs.add(img3);
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = null;

        switch (viewType){
            case VIEW_TYPE_ROLL:
                view = mInflater.inflate(R.layout.item_home_roll, parent, false);
                break;
            case VIEW_TYPE_COLUMN:
                view = mInflater.inflate(R.layout.item_home_column, parent, false);
                break;
            case VIEW_TYPE_RECOMMEND:
                view = mInflater.inflate(R.layout.item_home_recommend, parent, false);
                break;
            default:
                break;
        }


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case VIEW_TYPE_ROLL:
                RollPagerView roll = (RollPagerView)holder.itemView;
                roll.setAdapter(new RollAdapter(roll, imgs));
                break;
            case VIEW_TYPE_COLUMN:
                RecyclerView recycler = (RecyclerView) holder.itemView;
                GridLayoutManager manager = new GridLayoutManager(holder.itemView.getContext(), 4);
                recycler.setLayoutManager(manager);
                recycler.setAdapter(new ColumnAdapter(holder.itemView.getContext()));
                break;
            case VIEW_TYPE_RECOMMEND:
                RecyclerView recycler1 = (RecyclerView) holder.itemView.findViewById(R.id.id_recycler_recommend);
                GridLayoutManager manager1 = new GridLayoutManager(holder.itemView.getContext(),3);
                recycler1.setLayoutManager(manager1);
                recycler1.setAdapter(new RecommendAdapter(holder.itemView.getContext()));



                break;
            default:
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public int getItemViewType(int position) {
        int ret = VIEW_TYPE_ROLL;
        switch (position){
            case 0:
                ret = VIEW_TYPE_ROLL;
                break;
            case 1:
                ret = VIEW_TYPE_COLUMN;
                break;
            case 2:
                ret = VIEW_TYPE_RECOMMEND;
                break;
            default:
                break;
        }

        return ret;
    }
}
