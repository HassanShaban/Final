package com.example.afinal.repositories;

import android.arch.lifecycle.MutableLiveData;

import com.example.afinal.R;
import com.example.afinal.models.Places;

import java.util.ArrayList;

/**
 *  Single Tone Class
 */
public class PlaceRepository {

    ArrayList<Places> nicePlaces = new ArrayList<>();

    MutableLiveData<ArrayList<Places>> mNicePlaces = new MutableLiveData<>();


    public static PlaceRepository instance;

    public static PlaceRepository getInstance(){

        if(instance ==  null)
            instance = new PlaceRepository();

        return instance;

    }

    public MutableLiveData<ArrayList<Places>> getmNicePlaces() {

        setData();
        mNicePlaces.setValue(nicePlaces);
        return mNicePlaces;
    }

    void setData(){

        nicePlaces.add(new Places("Cairo" , R.drawable.companies));
        nicePlaces.add(new Places("Egypt" , R.drawable.companies));
        nicePlaces.add(new Places("Alex" , R.drawable.companies));
        nicePlaces.add(new Places("Quesna" , R.drawable.companies));

    }

}
