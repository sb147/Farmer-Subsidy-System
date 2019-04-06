package com.example.shivanibhandari.govtside;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddSubsidies extends AppCompatActivity {
    private EditText eSubsidyName;
    private EditText eAmountPerHectare;
    private Spinner sSubsidyType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subsidies);

        eSubsidyName = findViewById(R.id.eSubsidyName);
        eAmountPerHectare = findViewById(R.id.eAmountPerHectare);
        sSubsidyType = findViewById(R.id.sSubsidyType);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Subsidy_Type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sSubsidyType.setAdapter(adapter);





    }
}
