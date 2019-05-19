package com.example.afinal.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.afinal.R;
import com.example.afinal.databinding.AdapterBinding;
import com.example.afinal.models.Places;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {


    ArrayList<Places> data;
    Context context;

    public Adapter(ArrayList<Places> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        AdapterBinding adapterBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()) , R.layout.adapter ,parent, false
        );

        Holder holder = new Holder(adapterBinding);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

        Places places = data.get(i);
        holder.adapterBinding.setPlaces(places);

    }

    @Override
    public int getItemCount() {

        return data.size();

    }




    class Holder extends RecyclerView.ViewHolder{


       AdapterBinding adapterBinding;

       public Holder(@NonNull AdapterBinding itemView) {

           super(itemView.getRoot());
           adapterBinding = itemView;

       }
   }
}
