package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yun on 2017/4/19.
 */

public class Basic {

    @SerializedName("city")
    public String CityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
