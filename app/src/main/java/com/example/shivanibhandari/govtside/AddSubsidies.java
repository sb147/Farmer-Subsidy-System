package com.example.shivanibhandari.govtside;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddSubsidies extends AppCompatActivity {

    private EditText eSubsidyName;
    private Spinner sSubsidyType;
    private EditText eAmountPerHectare;
    private final String tag = "AddSubsidies";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subsidies);

        eSubsidyName =  findViewById(R.id.eSubsidyName);
        sSubsidyType = findViewById(R.id.sSubsidyType);
        eAmountPerHectare = findViewById(R.id.eAmountPerHectare);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Subsidy_Type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sSubsidyType.setAdapter(adapter);

    }

    public void Submit(View v)
    {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Subsidies");
        String key = databaseReference.push().getKey();
        databaseReference.child(key).child("SubsidyName").setValue(eSubsidyName.getText().toString());
        databaseReference.child(key).child("SubsidyType").setValue(sSubsidyType.getSelectedItem().toString());
        databaseReference.child(key).child("AmountPerHectare").setValue(eAmountPerHectare.getText().toString());

        Toast.makeText(this,"Subsidy Added",Toast.LENGTH_LONG).show();
        finish();
    }
}
