package com.example.shivanibhandari.govtside;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
=======
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
>>>>>>> c3812343a1be957bf1a5f62835ee052483e3438d

public class AddSubsidies extends AppCompatActivity {
    private EditText eSubsidyName;
    private EditText eAmountPerHectare;
    private Spinner sSubsidyType;


    private EditText eSubsidyName;
    private Spinner sSubsidyType;
    private EditText eAmountPerHectare;
    private final String tag = "AddSubsidies";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subsidies);

<<<<<<< HEAD
        eSubsidyName =  findViewById(R.id.eSubsidyName);
        sSubsidyType = findViewById(R.id.sSubsidyType);
        eAmountPerHectare = findViewById(R.id.eAmountPerHectare);
=======
        eSubsidyName = findViewById(R.id.eSubsidyName);
        eAmountPerHectare = findViewById(R.id.eAmountPerHectare);
        sSubsidyType = findViewById(R.id.sSubsidyType);
>>>>>>> c3812343a1be957bf1a5f62835ee052483e3438d
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Subsidy_Type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sSubsidyType.setAdapter(adapter);

<<<<<<< HEAD
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
=======




>>>>>>> c3812343a1be957bf1a5f62835ee052483e3438d
    }
}
