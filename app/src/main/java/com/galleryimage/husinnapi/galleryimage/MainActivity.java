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

public class MainActivity extends AppCompatActivity {

//    TODO:: Change Image and implement to COC

    private RecyclerView listView;
    private LinearLayoutManager linearLayoutManager;
    private List<ItemObject> itemObjects;
    private AdapterItem adapterItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listView = (RecyclerView) findViewById(R.id.listView);
        linearLayoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(linearLayoutManager);

        itemObjects = new ArrayList<>();
        itemObjects.add(new ItemObject("Promo", "16:33:50 19 Agustus 2016", "http://sta.nusatrip.net/cmsimg/61/61/banner-mandala_promo_id.jpg"));
        itemObjects.add(new ItemObject("Promo", "16:33:50 19 Agustus 2016", "http://anamblog.com/wp-content/uploads/2012/02/harga-promo-tiket-murah-air-asia-2012.jpg"));
        itemObjects.add(new ItemObject("Promo", "16:33:50 19 Agustus 2016", "http://indotiketmurah.com/wp-content/uploads/sites/3/2016/07/tiket-promo-pesawat.jpg"));
        itemObjects.add(new ItemObject("Promo", "16:33:50 19 Agustus 2016", "http://sta.nusatrip.net/cmsimg/61/61/banner-mandala_promo_id.jpg"));
        itemObjects.add(new ItemObject("Promo", "16:33:50 19 Agustus 2016", "http://anamblog.com/wp-content/uploads/2012/02/harga-promo-tiket-murah-air-asia-2012.jpg"));
        itemObjects.add(new ItemObject("Promo", "16:33:50 19 Agustus 2016", "http://sta.nusatrip.net/cmsimg/61/61/banner-mandala_promo_id.jpg"));
        itemObjects.add(new ItemObject("Promo", "16:33:50 19 Agustus 2016", "http://indotiketmurah.com/wp-content/uploads/sites/3/2016/07/tiket-promo-pesawat.jpg"));

        adapterItem = new AdapterItem(getApplicationContext(),itemObjects);
        listView.setAdapter(adapterItem);
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
