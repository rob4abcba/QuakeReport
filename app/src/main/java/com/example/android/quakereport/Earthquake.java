package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of the quake
    private String mMagnitude;

    // Location of the quake
    private String mLocation;

    // Date of the quake
    private String mDate;


    /*
     * Create a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude of the quake
     * @param location is the city location of the quake
     * @param date is the date the quake happened
     * */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
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
     * Get date of the quake
     */
    public String getDate() {
        return mDate;
    }


}
