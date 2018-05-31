package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends BaseAdapter {
    private List<Album> albumData;
    private LayoutInflater layoutInflater;
    private Context context;

    public AlbumAdapter(Context aContext, List<Album> albumData) {
        this.context = aContext;
        this.albumData = albumData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return albumData.size();
    }

    @Override
    public Object getItem(int position) {
        return albumData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        ImageView imageView;

        View gridItemView = convertView;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.grid_item, null);
            holder = new ViewHolder();
            holder.img = (ImageView) convertView.findViewById(R.id.albumCover);
            holder.albumName = (TextView) convertView.findViewById(R.id.album_name_text_view);

            holder.artistName = (TextView) convertView.findViewById(R.id.artist_name_text_view);
            convertView.setTag(holder);

            Album album = this.albumData.get(position);
            holder.albumName.setText(album.getAlbumName());

            holder.artistName.setText(album.getArtistName());
            holder.img.setImageResource(album.getAlbumResourceId());

        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    static class ViewHolder {
        TextView albumName;
        TextView artistName;
        ImageView img;
    }
}
