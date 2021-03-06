package com.galleryimage.husinnapi.galleryimage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import butterknife.BindView;

/**
 * Created by husinnapi on 9/21/16.
 */
public class AdFlightAdapter extends RecyclerView.Adapter<AdFlightHolder> {

    private Context context;
    private List<AdFlight> adFlights;
    private Intent webIntent;

    public AdFlightAdapter(Context context, List<AdFlight> adFlights) {
        this.context = context;
        this.adFlights = adFlights;
    }

    @Override
    public AdFlightHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adflightitem, null);
        AdFlightHolder adFlightHolder = new AdFlightHolder(view);
        return adFlightHolder;
    }

    @Override
    public void onBindViewHolder(AdFlightHolder adFlightHolder, final int position) {
        adFlightHolder.txtjudul.setText(adFlights.get(position).strJudul);
        adFlightHolder.txtwaktu.setText(adFlights.get(position).strWaktu);
        Glide.with(context)
                .load(adFlights.get(position).strGambar)
                .thumbnail(0.5f)
                .crossFade()
                .fitCenter()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)
                .into(adFlightHolder.img);

        adFlightHolder.itemView.setOnClickListener(v -> {
                switch (position) {
                    case 0:
                        openAdUrl(Uri.parse("http://www.panorama-tours.com/event/trinity-travel-fair?desktop=true"));
                        break;
                    case 1:
                        openAdUrl(Uri.parse("http://www.panorama-tours.com/promosi/diskon-khusus-cicilan?desktop=true"));
                        break;
                    case 2:
                        openAdUrl(Uri.parse("http://www.panorama-tours.com/promosi/shocking-offer?in_source=shocking-offer&desktop=true"));
                        break;
                    case 3:
                        openAdUrl(Uri.parse("http://www.panorama-tours.com/promo/promo-cicilan-bank?in_source=promo-cicilan-bank&desktop=true"));
                        break;
                }
        });
    }

    private void openAdUrl(Uri parse) {
        webIntent = new Intent(Intent.ACTION_VIEW, parse);
        if (webIntent.resolveActivity(context.getPackageManager()) != null) {
            webIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(webIntent);
        }
    }

    @Override
    public int getItemCount() {
        return adFlights.size();
    }
}
