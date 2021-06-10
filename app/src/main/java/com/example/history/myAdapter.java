package com.example.history;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends FirebaseRecyclerAdapter<model,myAdapter.myViewHHolder> {

    public myAdapter() {

    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHHolder, int position,@NonNull model model){

    }

    @NonNull
    @Override
    protected  myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new  myViewHHolder(view);
    }

    class myViewHHolder extends RecyclerView.ViewHolder{

        TextView date,time,from_coor,toCoor,distance;

        public myViewHHolder(@NonNull View itemView) {
            super(itemView);
            date=(TextView)itemView.findViewById(R.id.date);
            time=(TextView)itemView.findViewById(R.id.time);
            from_coor=(TextView)itemView.findViewById(R.id.from_coor);
            toCoor=(TextView)itemView.findViewById(R.id.to_coor);
            distance=(TextView)itemView.findViewById(R.id.distance);
        }
    }
}
