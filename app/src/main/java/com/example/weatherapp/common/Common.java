package com.example.weatherapp.common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID = "2209eec1d4df1c8822bc0cfa70e9ff8f";
    public static Location current_location = null;

    public static String convertUnixToDatetime(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = df.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long sunrise) {
        Date date = new Date(sunrise*1000L);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        String formatted = df.format(date);
        return formatted;
    }
}
