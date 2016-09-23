package com.galleryimage.husinnapi.galleryimage;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.listView)
    RecyclerView listView;

    private LinearLayoutManager linearLayoutManager;
    private List<AdFlight> adFlights;
    private AdFlightAdapter adapterItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setToolbar();
        setFloatingActionButton();
        setLayoutManager();
        setAdFlight();
        setAdapterItem();
    }

    private void setAdapterItem() {
        adapterItem = new AdFlightAdapter(getApplicationContext(), adFlights);
        listView.setAdapter(adapterItem);
    }

    private void setAdFlight() {
        adFlights = new ArrayList<>();
        adFlights.add(new AdFlight("Promo", "16:33:50 19 Agustus 2016", "http://www.panorama-tours.com/themes/basic-v2/assets/uploads/landing_page/xlanding-page40.jpg.pagespeed.ic.xnhhnMStin.webp"));
        adFlights.add(new AdFlight("Promo", "16:33:50 19 Agustus 2016", "http://www.panorama-tours.com/themes/basic-v2/assets/uploads/landing_page/xlanding-page39.jpg.pagespeed.ic.RvtmeuFUcQ.webp"));
        adFlights.add(new AdFlight("Promo", "16:33:50 19 Agustus 2016", "http://www.panorama-tours.com/themes/basic-v2/assets/uploads/landing_page/xlandingpage2.jpg.pagespeed.ic.0ojkLmyWVV.webp"));
        adFlights.add(new AdFlight("Promo", "16:33:50 19 Agustus 2016", "http://www.panorama-tours.com/themes/basic-v2/assets/images/xcicilan-mi.jpg.pagespeed.ic.GbeVbga0hM.webp"));
    }

    private void setLayoutManager() {
        linearLayoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(linearLayoutManager);
    }

    private void setFloatingActionButton() {
        fab.setOnClickListener(v -> Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show());
    }

    private void setToolbar() {
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
