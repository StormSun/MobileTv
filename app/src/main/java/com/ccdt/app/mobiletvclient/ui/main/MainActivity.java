package com.ccdt.app.mobiletvclient.ui.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioGroup;

import com.ccdt.app.mobiletvclient.R;
import com.ccdt.app.mobiletvclient.ui.base.BaseActivity;
import com.ccdt.app.mobiletvclient.ui.discover.DiscoverFragment;
import com.ccdt.app.mobiletvclient.ui.home.HomeFragment;
import com.ccdt.app.mobiletvclient.ui.my.MyFragment;
import com.ccdt.app.mobiletvclient.ui.news.NewsFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity  {

    private List<Fragment> mFragments;
    private ViewPager mPager;
    private MainAdapter mAdapter;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        mPager = ((ViewPager) findViewById(R.id.id_pager));
        mRadioGroup = ((RadioGroup) findViewById(R.id.id_rg));

        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new DiscoverFragment());
        mFragments.add(new NewsFragment());
        mFragments.add(new MyFragment());

        mAdapter = new MainAdapter(getSupportFragmentManager(), mFragments);

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int childCount = group.getChildCount();
                if (childCount> 0){
                    for (int i = 0; i < childCount; i++) {
                        View child = group.getChildAt(i);
                        if(child.getId() == checkedId){
                            mPager.setCurrentItem(i);
                        }
                    }
                }
            }
        });

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mRadioGroup.check(mRadioGroup.getChildAt(position).getId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mPager.setAdapter(mAdapter);

    }


    @Override
    protected void loadData() {

    }


}
