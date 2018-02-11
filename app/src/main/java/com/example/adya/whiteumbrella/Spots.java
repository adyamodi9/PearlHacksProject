package com.example.adya.whiteumbrella;

/**
 * Created by kyraalexandraleroux on 2/11/18.
 */

public class Spots {
    private int latitude = 0;
    private int longitude = 0;
    private String name = "";
    public Spots(int lat, int lon, String modifier) {
        latitude = lat;
        longitude = lon;
        name = modifier;
    }
    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public String getName1() {
        return name;
    }
}
