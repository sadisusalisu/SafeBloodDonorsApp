package com.square.tech.safeblooddonors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class How_To_Become_A_Donor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how__to__become__a__donor);

        getSupportActionBar().setTitle("How to Become a Donor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
