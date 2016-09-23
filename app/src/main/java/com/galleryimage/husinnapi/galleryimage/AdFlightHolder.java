package com.galleryimage.husinnapi.galleryimage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by husinnapi on 9/21/16.
 */
public class AdFlightHolder extends RecyclerView.ViewHolder {

    public TextView txtjudul, txtwaktu;
    public ImageView img;

    public AdFlightHolder(View itemView) {
        super(itemView);

        txtjudul = (TextView) itemView.findViewById(R.id.txtjudul);
        txtwaktu = (TextView) itemView.findViewById(R.id.txtwaktu);
        img = (ImageView) itemView.findViewById(R.id.img);
    }
}
