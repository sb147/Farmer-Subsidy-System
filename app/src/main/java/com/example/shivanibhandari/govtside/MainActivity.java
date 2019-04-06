package com.example.shivanibhandari.govtside;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateDetail(View view)
    {
        Intent  i = new Intent(this,new UpdateDetails().getClass() );
        startActivity(i);
    }

    public void addSubsidies(View view){
        Intent i=new Intent(this, new AddSubsidies().getClass());
        startActivity(i);
    }
}
