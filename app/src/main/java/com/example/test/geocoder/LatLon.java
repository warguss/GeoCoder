package com.example.test.geocoder;

/**
 * Created by WooChan on 2016-01-23.
 */
public class LatLon {
    double lat; // 위도
    double lon; // 경도

    public LatLon(double nLat, double nLon)
    {
        lat = nLat; lon = nLon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }
}
