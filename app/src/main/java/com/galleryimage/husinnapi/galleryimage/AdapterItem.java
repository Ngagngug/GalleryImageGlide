package com.galleryimage.husinnapi.galleryimage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

/**
 * Created by husinnapi on 9/21/16.
 */
public class AdapterItem extends RecyclerView.Adapter<Holder> {

    Context context;
    List<ItemObject> itemObjects;

    public AdapterItem(Context context, List<ItemObject> itemObjects) {
        this.context = context;
        this.itemObjects = itemObjects;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carditem, null);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.txtjudul.setText(itemObjects.get(position).strJudul);
        holder.txtwaktu.setText(itemObjects.get(position).strWaktu);
        Glide.with(context)
                .load(itemObjects.get(position).strGambar)
                .thumbnail(0.5f)
                .crossFade()
                .fitCenter()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return itemObjects.size();
    }
}
