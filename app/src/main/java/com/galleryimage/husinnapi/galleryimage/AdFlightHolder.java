package com.galleryimage.husinnapi.galleryimage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by husinnapi on 9/21/16.
 */
public class AdFlightHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.txtjudul)
    TextView txtjudul;
    @BindView(R.id.txtwaktu)
    TextView txtwaktu;
    @BindView(R.id.img)
    ImageView img;

    public AdFlightHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
