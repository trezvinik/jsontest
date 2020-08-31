package com.example.jsontest;

public class ExampleItem {
    private String mRealName;
    private int mPvNr;

    public ExampleItem(String realName, int pvNr) {
        mRealName = realName;
        mPvNr = pvNr;
    }

    public String getRealName() {
        return mRealName;
    }

    public int getPvNr() {
        return mPvNr;
    }
}

