package com.example.tour_app;

public class PlacesDetails {
    private String mPlaceName;
    private String mLocation;
    private int mImageResourceId;

    public PlacesDetails( String placeName, String location, int imageResourceId){
        mPlaceName = placeName;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }
    public String getPlaceName() {
        return mPlaceName;
    }
    public String getLocation() {
        return mLocation;
    }
    public int getmImageResourceId(){
        return  mImageResourceId;
    }
}
