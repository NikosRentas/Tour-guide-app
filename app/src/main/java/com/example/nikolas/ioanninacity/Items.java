package com.example.nikolas.ioanninacity;

public class Items {
    private static final int NO_IMAGE = -1;
    private static final int NO_THIRD_TEXT = -1;

    private String mName;
    private String mInfo;   // Info = address or something else
    private String mOdd;
    private int mImageResourceID = NO_IMAGE;
    private int mTextExist = NO_THIRD_TEXT;

    public Items(String mName, String mInfo) {
        this.mName = mName;
        this.mInfo = mInfo;
    }

    public Items(String mName, String mInfo, String mOdd) {
        this.mName = mName;
        this.mInfo = mInfo;
        this.mOdd = mOdd;
        mTextExist = 1;
    }

    public Items(String mName, String mInfo, String mOdd, int mImageResourseID) {
        this.mName = mName;
        this.mInfo = mInfo;
        this.mOdd = mOdd;
        this.mImageResourceID = mImageResourseID;
        mTextExist = 1;
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmInfo() {
        return mInfo;
    }

    public void setmInfo(String mInfo) {
        this.mInfo = mInfo;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasmTextExist() {
        return mTextExist != NO_THIRD_TEXT;
    }

    public String getmOdd() {
        return mOdd;
    }

    public void setmOdd(String mOdd) {
        this.mOdd = mOdd;
    }
}
