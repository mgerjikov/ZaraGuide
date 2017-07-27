package com.example.android.zaraguide;


public class Place {

    private String mPlaceName;
    private String mPlaceAddress;
    private String mPlaceDescription;
    private int mPlaceImageResourceID;


    public Place(String placeName, String placeAddress, String placeDescription, int placeImageID) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceDescription = placeDescription;
        mPlaceImageResourceID = placeImageID;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceAddress() {
        return mPlaceAddress;
    }

    public String getmPlaceDescription() {
        return mPlaceDescription;
    }

    public int getmPlaceImageResourceID() {
        return mPlaceImageResourceID;
    }

}
