package com.example.afinal.models;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

public class Places {

    String countryName;
    int imageID;

    public Places(String countryName, int imageID) {

        this.countryName = countryName;
        this.imageID = imageID;

    }

    public String getCountryName() {

        return countryName;
    }

    public int getImageID() {

        return imageID;

    }

    @BindingAdapter("imgUrlHassan")
    public static void setImageUrl(View view , int imageID ){

        ImageView image = (ImageView) view;
        image.setImageDrawable(ContextCompat.getDrawable(view.getContext() , imageID));

    }


}
