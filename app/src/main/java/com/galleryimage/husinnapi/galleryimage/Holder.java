package com.galleryimage.husinnapi.galleryimage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by husinnapi on 9/21/16.
 */
public class Holder extends RecyclerView.ViewHolder {

    public TextView txtjudul, txtwaktu;
    public ImageView img;

    public Holder(View itemView) {
        super(itemView);

        txtjudul = (TextView) itemView.findViewById(R.id.txtjudul);
        txtwaktu = (TextView) itemView.findViewById(R.id.txtwaktu);
        img = (ImageView) itemView.findViewById(R.id.img);
    }
}
