package com.ccdt.app.mobiletvclient.ui.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by StormSun on 2016/6/24.
 */
public class MainAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;

    public MainAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return this.mFragments.get(position);
    }

    @Override
    public int getCount() {
        int ret = 0;
        if (this.mFragments != null) {
            ret = this.mFragments.size();
        }
        return ret;
    }
}
