package com.coolweather.android.gson;

/**
 * Created by yun on 2017/4/20.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
