package com.example.jsontest;

public class ExampleItem {
    private String mRealName;
    private int mLikes;

    public ExampleItem(String realName, int likes) {
        mRealName = realName;
        mLikes = likes;
    }

    public String getRealName() {
        return mRealName;
    }

    public int getLikeCount() {
        return mLikes;
    }
}

