package com.example.shivanibhandari.govtside;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class FarmerListAdapter extends RecyclerView.Adapter<FarmerListAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Farmer> farmers;
    private LayoutInflater inflater;
    public FarmerListAdapter(Context context, ArrayList<Farmer> farmers) {
        this.context = context;
        this.farmers = farmers;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.farmer_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Farmer f = farmers.get(position);
        holder.tFarmerId.setText(f.getId());
        holder.tFarmerName.setText(f.getName());
        holder.lFarmerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(context,/*class*/); //Insert the class you want;
                i.putExtra("Id",f.getId());
                i.putExtra("Name",f.getName());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return farmers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tFarmerId;
        private TextView tFarmerName;
        private LinearLayout lFarmerLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.tFarmerId = itemView.findViewById(R.id.tFarmerId);
            this.tFarmerName = itemView.findViewById(R.id.tFarmerName);
            this.lFarmerLayout=itemView.findViewById(R.id.lFarmerlayout);
        }
    }
}
