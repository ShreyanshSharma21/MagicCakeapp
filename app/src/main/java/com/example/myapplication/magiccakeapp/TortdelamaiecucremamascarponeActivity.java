package com.example.myapplication.magiccakeapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Alin on 7/3/2016.
 */
public class TortdelamaiecucremamascarponeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tortdelamaiecucremamascarpone);

        final Toolbar toolbar = (Toolbar)findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("Tort de lamaie cu crema mascarpone"); // name for title
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.rgb(230, 230, 250)); // Color of title after collapse
        collapsingToolbarLayout.setExpandedTitleColor(Color.rgb(255,24,68)); // Color of title before collapse

        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context,R.color.colorPrimary));

    }
}