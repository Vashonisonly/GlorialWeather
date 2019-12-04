package com.example.glorialweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    public Updata update;
    public class Updata {
        @SerializedName("loc")
        public String updataTime;
    }
}
