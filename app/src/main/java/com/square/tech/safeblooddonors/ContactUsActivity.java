package com.square.tech.safeblooddonors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactUsActivity extends AppCompatActivity {
    private Button FeedBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        getSupportActionBar().setTitle("Contact US");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FeedBack = (Button) findViewById(R.id.btn_FeedBack);
        FeedBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ContactUsActivity.this, FeedBack.class));
            }
        });
    }}
