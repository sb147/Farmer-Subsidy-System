package com.example.shivanibhandari.govtside;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class UpdateDetails extends AppCompatActivity {

    private RecyclerView rFarmerDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_details);
        
        rFarmerDetails =  findViewById(R.id.rFarmerDetails);
    }


}
