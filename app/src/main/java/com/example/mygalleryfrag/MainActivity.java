package com.example.mygalleryfrag;

import static java.security.AccessController.getContext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    int img;
    imges images;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
recyclerView=findViewById(R.id.recyc);
        ArrayList<imges> items1 = new ArrayList<>();

        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));
        items1.add(new imges(R.drawable.karahi));


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,true);
        galleryAdaptor adaptor=new galleryAdaptor(getApplicationContext(),items1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptor);


        Fragment argumentFragment = new FragmentGallery();//Get Fragment Instance
        Bundle data = new Bundle();//Use bundle to pass data
        data.putInt("data",img);//put string, int, etc in bundle with a key value
        argumentFragment.setArguments(data);//Finally set argument bundle to fragment
//
//        fragmentManager.beginTransaction().replace(R.id.img1, argumentFragment).commit();//now replace the argument fragment


//        recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // set the selected image in the ImageView
//                imges.setImageResource(images[position]);
//
//            }
//        });
        recyclerView.addOnItemTouchListener(
                new RecyclerView.OnItemTouchListener() {
                    @Override
                    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                        return false;
                    }

                    @Override
                    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                        img=images.getImages();

                    }

                    @Override
                    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

                    }
                }
        );
    }

}