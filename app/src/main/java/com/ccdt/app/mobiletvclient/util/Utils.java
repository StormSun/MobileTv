package com.ccdt.app.mobiletvclient.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ccdt.app.mobiletvclient.R;

public final class Utils {
    private Utils() {
    }


    public static void displayImage(Context context, ImageView imageView, String url){
        Glide.with(context).load(url).placeholder(R.drawable.ptr_rotate_arrow).into(imageView);
    }

    public static int convertToInt(Object value, int defaultValue) {
        if (value == null || "".equals(value.toString().trim())) {
            return defaultValue;
        }
        try {
            return Integer.valueOf(value.toString());
        } catch (Exception e) {
            try {
                return Double.valueOf(value.toString()).intValue();
            } catch (Exception e1) {
                return defaultValue;
            }
        }
    }
}
