package com.example.myapplication.magiccakeapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Alin on 6/14/2016.
 */

public class ReteteActivity extends Activity {

    final int[]imgs={
            R.drawable.amandine,
            R.drawable.rulouricucremadevanilie,
            R.drawable.placintaalbacazapada,
            R.drawable.tortdelamaiecubezea,
            R.drawable.tortdelamaiecucremamascarpone,
            R.drawable.pogacelecujumari};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retete);

        String[] cakes = {"Amandine", "Rulouri cu crema de vanilie", "Placinta Alba ca Zapada", "Tort de lamaie cu bezea", "Tort de lamaie cu crema mascarpone","Pogacele cu jumari"};
        ListAdapter adapter = new CustomAdapter(this, cakes, imgs);
        ListView cakeListView = (ListView) findViewById(R.id.cakeListView);
        cakeListView.setAdapter(adapter);

        // from here i start to code opening a new activity when onclicklistener

        cakeListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch (position){

                    case 0:
                        Intent AmandineActivity = new Intent(ReteteActivity.this, AmandineActivity.class);
                        startActivity(AmandineActivity);

                        break;

                    case 1:
                        Intent RulouriActivity = new Intent(ReteteActivity.this, RulouriActivity.class);
                        startActivity(RulouriActivity);

                        break;

                    case 2:
                        Intent AlbacazapadaActivity = new Intent(ReteteActivity.this, com.example.myapplication.magiccakeapp.AlbacazapadaActivity.class);
                        startActivity(AlbacazapadaActivity);

                        break;

                    case 3:
                        Intent TortdelamaiecubezeaActivity = new Intent(ReteteActivity.this, com.example.myapplication.magiccakeapp.TortdelamaiecubezeaActivity.class);
                        startActivity(TortdelamaiecubezeaActivity);

                        break;

                    case 4:
                        Intent TortdelamaiecucremamascarponeActivity = new Intent (ReteteActivity.this, com.example.myapplication.magiccakeapp.TortdelamaiecucremamascarponeActivity.class);
                        startActivity(TortdelamaiecucremamascarponeActivity);

                        break;

                    case 5:
                        Intent PogacelecujumariActivity = new Intent (ReteteActivity.this, com.example.myapplication.magiccakeapp.PogacelecujumariActivity.class);
                        startActivity(PogacelecujumariActivity);

                        break;
                }
            }
        });
    }

}


