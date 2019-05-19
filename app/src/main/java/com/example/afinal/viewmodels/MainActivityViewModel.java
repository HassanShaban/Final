package com.example.afinal.viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.afinal.models.Places;
import com.example.afinal.repositories.PlaceRepository;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {

    MutableLiveData<ArrayList<Places>> mNicePlaces;
    PlaceRepository instance;


    public void init(){

        if(mNicePlaces != null)
            return;

        instance = PlaceRepository.getInstance();
        mNicePlaces = instance.getmNicePlaces();

    }

    public MutableLiveData<ArrayList<Places>> getmNicePlaces() {
        return mNicePlaces;
    }
}
