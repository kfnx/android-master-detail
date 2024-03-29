package com.uhuy.dicodingsubmissionandroid;

import android.view.View;

public abstract class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }

    public abstract void onItemClicked(View view, int position);

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
