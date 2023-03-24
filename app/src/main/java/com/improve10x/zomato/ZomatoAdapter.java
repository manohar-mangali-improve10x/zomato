package com.improve10x.zomato;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ZomatoAdapter extends RecyclerView.Adapter<ZomatoViewHolder> {
    ZomatoItems[] items;
    public ZomatoAdapter(ZomatoItems[]zomatoItems){
        items = zomatoItems;
    }
    @NonNull
    @Override
    public ZomatoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.zomato_item,parent,false);
        ZomatoViewHolder viewHolder = new ZomatoViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ZomatoViewHolder holder, int position) {
        ZomatoItems item1 =  items[position];
        holder.ratingTxt.setText(item1.rate);
        holder.costTxt.setText(item1.cost);
        holder.timeTxt.setText(item1.time);
        Picasso.get().load(item1.poster).into(holder.posterIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
