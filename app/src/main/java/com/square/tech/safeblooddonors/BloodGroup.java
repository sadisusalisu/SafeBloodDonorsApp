package com.square.tech.safeblooddonors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BloodGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_group);

        getSupportActionBar().setTitle("Safe Blood Donors");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
