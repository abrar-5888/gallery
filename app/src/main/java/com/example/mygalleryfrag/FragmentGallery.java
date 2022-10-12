package com.example.mygalleryfrag;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentGallery extends Fragment{



/**
 * Created by SONU on 07/10/15.
 */


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);//Inflate Layout
        ImageView img1 = (ImageView) view.findViewById(R.id.fragimg1);//Find textview Id


        //Get Argument that passed from activity in "data" key value
        int getArgument = getArguments().getInt("data");
        img1.setImageResource(getArgument);

        return view;//return view
    }
}