package com.example.shivanibhandari.govtside;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class UpdateDetails extends AppCompatActivity {

    private RecyclerView rFarmerDetails;
    private ArrayList<Farmer> farmers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_details);
        
        rFarmerDetails =  findViewById(R.id.rFarmerDetails);
        farmers = new ArrayList<Farmer>();
        FirebaseDatabase.getInstance().getReference("Farmer").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                long count = dataSnapshot.getChildrenCount();
                long cnt=0;
                for(DataSnapshot childs:dataSnapshot.getChildren())
                {
                    String key = childs.getKey();
                    String name = childs.child("Name").getValue(String.class);
                    farmers.add(new Farmer(key,name));
                    cnt++;
                    if(cnt==count)
                    {
                            FarmerListAdapter farmerListAdapter = new FarmerListAdapter(UpdateDetails.this,farmers);
                            rFarmerDetails.setAdapter(farmerListAdapter);
                            rFarmerDetails.setLayoutManager(new LinearLayoutManager(UpdateDetails.this));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
