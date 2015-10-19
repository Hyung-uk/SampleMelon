package com.lhu.samplemelon;

/**
 * Created by Tacademy on 2015-10-19.
 */
public class Song {
    int songId;
    String songName;
    int albumId;
    String albumName;
    int currentRank;


    @Override
    public String toString() {
        return songName + "(" + currentRank + ")";
    }
}
