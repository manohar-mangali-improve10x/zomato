package com.improve10x.zomato;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ZomatoViewHolder  extends RecyclerView.ViewHolder {
    public TextView ratingTxt;
    public TextView costTxt;
    public TextView timeTxt;
    public ImageView posterIv;
    public ZomatoViewHolder(@NonNull View itemView) {
        super(itemView);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        costTxt = itemView.findViewById(R.id.cost_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
        posterIv = itemView.findViewById(R.id.poster_iv);
    }
}
