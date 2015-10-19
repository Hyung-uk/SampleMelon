package com.lhu.samplemelon;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tacademy on 2015-10-19.
 */
public class Melon {
    int menuId;
    int count;
    int page;
    @SerializedName("totalPages")
    int total;
    Songs songs;
}



