package com.ccdt.app.mobiletvclient.ui.home;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ccdt.app.mobiletvclient.util.Utils;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.LoopPagerAdapter;

import java.util.List;

/**
 * Created by StormSun on 2016/6/24.
 */
public class RollAdapter extends LoopPagerAdapter {
    private List<String> mImgs;

    public RollAdapter(RollPagerView viewPager, List<String> imgs) {
        super(viewPager);
        this.mImgs = imgs;
    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
//        view.setImageResource(imgs[position]);
        view.setScaleType(ImageView.ScaleType.FIT_XY);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        Utils.displayImage(container.getContext(), view, mImgs.get(position));
        return view;
    }

    @Override
    protected int getRealCount() {
        int ret = 0;
        if (this.mImgs != null) {
            ret = this.mImgs.size();
        }
        return ret;
    }
}
