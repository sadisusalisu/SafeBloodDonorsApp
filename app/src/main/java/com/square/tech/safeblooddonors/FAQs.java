package com.square.tech.safeblooddonors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FAQs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        getSupportActionBar().setTitle("FAQs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
