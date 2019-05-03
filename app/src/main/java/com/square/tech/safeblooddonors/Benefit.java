package com.square.tech.safeblooddonors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Benefit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benefit);

        getSupportActionBar().setTitle("Benefit");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
