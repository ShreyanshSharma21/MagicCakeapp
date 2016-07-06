package com.example.myapplication.magiccakeapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

/**
 * Created by Alin on 6/18/2016.
 */
public class BmiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        // here i start coding the operations and methods

        final Button btn_calc = (Button) findViewById(R.id.btncalc);
        final EditText field_greutate = (EditText) findViewById(R.id.field_greutate);
        final EditText field_inaltime = (EditText) findViewById(R.id.field_inaltime);
        final TextView textviewRezultat = (TextView) findViewById(R.id.textViewRezultat);
        final TextView textviewMesaj = (TextView) findViewById(R.id.textViewMesaj);

        btn_calc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                double greutate;
                double inaltime;
                double bmi;
                String msg="";

                if(field_inaltime.getText().toString().equals("") || field_greutate.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "Nu exista valoare valabila!", Toast.LENGTH_LONG);


                }else{


                    greutate = Double.parseDouble(field_greutate.getText().toString());
                    inaltime = Double.parseDouble(field_inaltime.getText().toString());

                    bmi = inaltime * inaltime;
                    bmi = greutate / bmi;

                    textviewRezultat.setText(new DecimalFormat("##.##").format(bmi));


                    if ( bmi < 18.5 ){
                        msg = "Sub greutatea normala";
                    }
                    else if ( bmi > 18.5 && bmi < 25 ){
                        msg = "Greutatea este normala!";
                    }
                    else if ( bmi > 25){
                        msg = "Peste greutatea normala";
                    }
                    textviewMesaj.setText(msg);
                }
            };
        });
    }}