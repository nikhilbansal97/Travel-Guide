package com.example.android.travelguide;

/**
 * Created by NIKHIL on 02-02-2017.
 */

public class Item {

    private String mName;
    private String mBrief;
    private String mRating;
    private int mResourceId;
    private String mAddress;

    public Item(String name, String brief, String rating, int resourceId) {
        mName = name;
        mBrief = brief;
        mRating = rating;
        mResourceId = resourceId;
    }

    public Item(String name, String brief, int resourceId) {
        mName = name;
        mResourceId = resourceId;
        mBrief = brief;
    }

    public Item(int resourceId, String name, String brief, String address) {
        mResourceId = resourceId;
        mName = name;
        mBrief = brief;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public String getBrief() {
        return mBrief;
    }

    public String getRating() {
        return mRating;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public String getAddress() {
        return mAddress;
    }
}
