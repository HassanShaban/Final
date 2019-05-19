package com.example.afinal;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.afinal.adapters.Adapter;
import com.example.afinal.databinding.ActivityMainBinding;
import com.example.afinal.viewmodels.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding activityMainBinding;
    Adapter adapter;
    MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        mainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        mainActivityViewModel.init();
        initRecyclerView();

    }

    void initRecyclerView(){

        adapter = new Adapter(mainActivityViewModel.getmNicePlaces().getValue() , this);
        RecyclerView.LayoutManager linearLayout = new LinearLayoutManager(this);
        activityMainBinding.recyclerView.setLayoutManager(linearLayout);
        activityMainBinding.recyclerView.setAdapter(adapter);

    }
}
