package com.ccdt.app.mobiletvclient.ui.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ccdt.app.mobiletvclient.R;

public class ColumnAdapter extends RecyclerView.Adapter<ColumnAdapter.ViewHolder> {


    private final LayoutInflater mInflater;

    public ColumnAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_column, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mIcon;
        TextView mTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            mIcon = (ImageView) itemView.findViewById(R.id.id_iv_icon);
            mTitle = (TextView) itemView.findViewById(R.id.id_tv_title);
        }
    }

}
