package com.waydrow.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Waydrow on 2017/3/3.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
