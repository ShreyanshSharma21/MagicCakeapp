package com.example.myapplication.magiccakeapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Alin on 6/16/2016.
 */
public class RulouriActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rulouri);

        final Toolbar toolbar = (Toolbar)findViewById(R.id.MyToolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapse_toolbar1);
        collapsingToolbarLayout.setTitle("Rulouri cu crema de vanilie"); // name for title
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.rgb(230, 230, 250)); // Color of title after collapse
        collapsingToolbarLayout.setExpandedTitleColor(Color.rgb(255,24,68)); // Color of title before collapse

        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context,R.color.colorPrimary));

    }
}
