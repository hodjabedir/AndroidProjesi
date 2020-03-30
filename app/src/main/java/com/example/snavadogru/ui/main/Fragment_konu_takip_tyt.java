package com.example.snavadogru.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snavadogru.R;

public class Fragment_konu_takip_tyt extends Fragment {
    View view;
    RecyclerView list;
    public Fragment_konu_takip_tyt(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       /* view = inflater.inflate(R.layout.fragment_konu_takip_tyt,container,false);*/
        return view;
    }
  /*  public void fild (){
        view.findViewById(R.layout.fragment_konu_takip_tyt);
    }*/
}
