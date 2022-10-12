package com.example.mygalleryfrag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class galleryAdaptor extends RecyclerView.Adapter<galleryAdaptor.vh> {
    Context context;
    ArrayList<imges> imges=new ArrayList<>();

    public galleryAdaptor(Context context, ArrayList<com.example.mygalleryfrag.imges> imges) {
        this.context = context;
        this.imges = imges;
    }

    @NonNull
    @Override
    public vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.design,null,false);
        return new vh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull vh holder, int position) {

holder.imges.setImageResource(imges.get(position).getImages());
holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
});

    }

    @Override
    public int getItemCount() {
        return imges.size();
    }

    public class vh extends RecyclerView.ViewHolder {
        ImageView imges;
        public vh(@NonNull View itemView) {
            super(itemView);

            imges=itemView.findViewById(R.id.img1);

        }
    }
}
