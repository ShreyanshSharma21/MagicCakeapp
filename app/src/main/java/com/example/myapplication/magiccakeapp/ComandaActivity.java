package com.example.myapplication.magiccakeapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


/**
 * Created by Alin on 6/19/2016.
 */
public class ComandaActivity extends Activity {

    Button comanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comanda);

        comanda = (Button) findViewById(R.id.btncomanda);

        comanda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0755158435")); // 0723512913 Prof.Univ.dr. Mariana Nagy
                startActivity(callIntent);
            }
        });
    }
}