package com.example.arvind.toizone;

/**
 * Created by Arvind on 03-02-2018.
 */

public class Place {

    public Double lat;
    public Double lon;
    public String title;

    public Place() {
    }

    public Place(Double lat, Double lon, String title) {
        this.lat = lat;
        this.lon = lon;
        this.title = title;


    }

    public String toString(){
        return this.lat + " " + this.lon + " " + this.title;
    }
}
