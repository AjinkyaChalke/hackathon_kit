package com.weiqilab.hackathon.hackathonkit.entities;

import android.databinding.BaseObservable;
import android.net.Uri;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ajinkyachalke on 7/29/17.
 */

public class ProfileEntity extends BaseObservable {

    @SerializedName("userid")
    public String mUserId;

    @SerializedName("name")
    public String mName;

    @SerializedName("picture")
    public String mPicture;

    @SerializedName("city")
    public String mCity;

    public ProfileEntity(String mUserId, String mName, String mPicture, String mCity) {
        this.mUserId = mUserId;
        this.mName = mName;
        this.mPicture = mPicture;
        this.mCity = mCity;
    }
}
