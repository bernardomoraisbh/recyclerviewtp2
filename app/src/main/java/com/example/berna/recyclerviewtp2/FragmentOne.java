package com.example.berna.recyclerviewtp2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank,container,false);
    }
}
