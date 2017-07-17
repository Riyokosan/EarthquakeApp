package com.example.android.quakereport;

/**
 * Created by Ryoko on 06/07/2017.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Where the earthquake happened */
    private String mLocation;

    /** When the earthquake happened */
    private long mTimeInMilliseconds;

    private String mUrl;


    /**
     * Create a new Earthquake object.
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is when this specific earthquake occurred
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl () {
        return mUrl;
    }

}
