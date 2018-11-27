package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the quake
    private String mMagnitude;

    // Location of the quake
    private String mLocation;

    // Date of the quake
    private long mTimeInMilliseconds;


    /*
     * Create a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude of the quake
     * @param location is the city location of the quake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     * */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Get magnitude of the quake
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get location of the quake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
