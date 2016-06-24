package com.ccdt.app.mobiletvclient.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ccdt.app.mobiletvclient.R;
import com.ccdt.app.mobiletvclient.ui.base.BaseFragment;

/**
 * Created by StormSun on 2016/6/23.
 */
public class HomeFragment extends BaseFragment {
    String[] imgs = {
            "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3425851328,2681317699&fm=21&gp=0.jpg",
            "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3700630188,1430779433&fm=21&gp=0.jpg",
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4168762024,1922499492&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=41411327,1928322537&fm=21&gp=0.jpg"};
    private RecyclerView mRecycler;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        mRecycler = ((RecyclerView) view.findViewById(R.id.id_recycler));
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        mRecycler.setLayoutManager(manager);
        mRecycler.setAdapter(new HomeAdapter(getContext()));
        return view;
    }

    //    @Override
//    protected void initVariables() {
//
//    }
//
//    @Override
//    protected void initViews(Bundle savedInstanceState) {
//        setContentView(R.layout.fragment_home);
//    }
//
//    @Override
//    protected void loadData() {
//
//    }
}
