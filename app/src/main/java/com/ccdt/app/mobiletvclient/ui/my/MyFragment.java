package com.ccdt.app.mobiletvclient.ui.my;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ccdt.app.mobiletvclient.R;
import com.ccdt.app.mobiletvclient.ui.base.BaseFragment;

/**
 * Created by StormSun on 2016/6/24.
 */
public class MyFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my, container, false);
    }
}
