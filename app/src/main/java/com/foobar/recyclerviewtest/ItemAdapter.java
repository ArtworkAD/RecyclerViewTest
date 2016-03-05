package com.foobar.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.RotatingViewHolder> {

    public ArrayList<Item> items = new ArrayList<>();

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public RotatingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RotatingViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item_single, parent, false));
    }

    @Override
    public void onBindViewHolder(RotatingViewHolder holder, int position) {

        Item item = items.get(position);

        holder.mTextViewIcon.setText(item.icon);
        holder.mTextViewIcon.setRotate(true);
        holder.mTextViewTitle.setText(item.title);
    }

    public static class RotatingViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.mTextViewIcon)
        IconTextView mTextViewIcon;

        @Bind(R.id.mTextViewTitle)
        TextView mTextViewTitle;

        public RotatingViewHolder(View mView) {
            super(mView);
            ButterKnife.bind(this, mView);
        }
    }

    public static class Item {

        String icon, title;
        boolean rotating;

        public Item(String icon, String title, boolean rotating) {
            this.icon = icon;
            this.title = title;
            this.rotating = rotating;
        }
    }
}