package com.square.tech.safeblooddonors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.square.tech.safeblooddonors.ui.about.AboutActivity;
import com.square.tech.safeblooddonors.ui.home.view.HomeActivity;

public class Empty extends AppCompatActivity implements View.OnClickListener {
    private CardView how,benefit,aboutcard,faqs,BG,aboutApp,MapCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        getSupportActionBar().setTitle("Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        how = (CardView) findViewById(R.id.how);
        benefit = (CardView) findViewById(R.id.benefit);
        aboutcard = (CardView) findViewById(R.id.aboutcard);
        faqs = (CardView) findViewById(R.id.faqs);
        BG = (CardView) findViewById(R.id.BG);
        MapCard = (CardView) findViewById(R.id.card_map);
        aboutApp = (CardView) findViewById(R.id.aboutApp);

        how.setOnClickListener(this);
        benefit.setOnClickListener(this);
        aboutcard.setOnClickListener(this);
        faqs.setOnClickListener(this);
        BG.setOnClickListener(this);
        aboutApp.setOnClickListener(this);
        MapCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.card_map: i = new Intent(this,HomeActivity.class);startActivity(i); break;
        case R.id.how: i= new Intent(this,How_To_Become_A_Donor.class);startActivity(i); break;

            case R.id.benefit: i = new Intent(this,Benefit.class);startActivity(i); break;
            case R.id.aboutApp: i = new Intent(this,ContactUsActivity.class);startActivity(i); break;
            case R.id.faqs: i = new Intent(this,FAQs.class);startActivity(i); break;
            case R.id.BG: i = new Intent(this,BloodGroup.class);startActivity(i); break;
            case R.id.aboutcard: i = new Intent(this, AboutActivity.class);startActivity(i); break;
          // case R.id.card_map: i = new Intent(this,HomeActivity.class); break;

            default: break;
    }
    }
}
