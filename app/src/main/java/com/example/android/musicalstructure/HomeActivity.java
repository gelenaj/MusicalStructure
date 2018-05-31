package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button searchButton;
    Button playlistButton;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(this);

        playlistButton = findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(this);

        ArrayList<Album> albumList = new ArrayList<Album>();
        albumList.add(new Album(getString(R.string._the_screaming_ghosts), getString(R.string.classic), R.drawable.screaming_ghosts));
        albumList.add(new Album(getString(R.string.echo_chamber), getString(R.string.london_calling), R.drawable.echo_chamber));
        albumList.add(new Album(getString(R.string.lost_ones), getString(R.string.forgotten), R.drawable.lost_ones));
        albumList.add(new Album(getString(R.string.holy_grail), getString(R.string.remember_my_name), R.drawable.holy_grail));
        albumList.add(new Album(getString(R.string.revolvers), getString(R.string.the_sky_is_falling), R.drawable.revolvers));
        albumList.add(new Album(getString(R.string.pebbles), getString(R.string.undercurrent), R.drawable.pebbles));

        AlbumAdapter adapter = new AlbumAdapter(this, albumList);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.searchButton:
                Intent i = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(i);
                break;
            case R.id.playlistButton:
                Intent x = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(x);
                break;
        }

    }
}





