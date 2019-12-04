package com.example.glorialweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Tmperature mTmperature;

    public class More{

        @SerializedName("cond_txt")
        public String info;

    }

    public class Tmperature{
        public String max;
        public String min;
    }

}
