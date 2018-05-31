package com.example.android.musicalstructure;

public class Album {
    private String mArtistName;
    private int mAlbumResourceId;
    private String mAlbumName;

    public Album(String artistName, int albumResourceId){
        mArtistName = artistName;
        mAlbumResourceId = albumResourceId;
    }

    public Album(String albumName, String artistName, int albumResourceId){
        mAlbumName = albumName;
        mAlbumResourceId = albumResourceId;
        mArtistName = artistName;
    }

    public String getArtistName() { return mArtistName;}
    public int getAlbumResourceId() {return mAlbumResourceId;}
    public String getAlbumName() {return  mAlbumName;}
}

