package com.waydrow.coolweather.gson;

/**
 * Created by Waydrow on 2017/3/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
    }
}
