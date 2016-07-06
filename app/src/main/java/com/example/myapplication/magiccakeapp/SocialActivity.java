package com.example.myapplication.magiccakeapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alin on 6/14/2016.
 */
public class SocialActivity extends AppCompatActivity {

    private static Button btn_bmi;
    private static Button btn_facts;
    private static Button btn_order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        // method for button BMI

        OnClickButtonListener();

        // method for button Facts

        OnClickButtonListener2();

        // method for button Order

        OnClickButtonListener3();

    }

    public void OnClickButtonListener(){
        btn_bmi=(Button)findViewById(R.id.btnbmi);
        btn_bmi.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.example.myapplication.magiccakeapp.BmiActivity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickButtonListener2(){
        btn_facts=(Button)findViewById(R.id.btnfacts);
        btn_facts.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.myapplication.magiccakeapp.FactsActivity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickButtonListener3(){
        btn_order=(Button) findViewById(R.id.btnorder);
        btn_order.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.myapplication.magiccakeapp.ComandaActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    public void browserfacebook (View view){
        Intent browserfacebookIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/popa.gabriela.77/media_set?set=a.245775025533281.49940.100003023569575&type=3"));
        startActivity(browserfacebookIntent);
    }


        // here i add the code for email send


    public void process(View view)
    {
        Intent intent = null, chooser = null;

        if(view.getId()==R.id.btnemail)
        {
            intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[]to={"heviutza@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "");
            intent.putExtra(Intent.EXTRA_TEXT, "");
            intent.setType("message/rfc822");
            chooser = Intent.createChooser(intent, "Send email");
            startActivity(chooser);
        }
    }

}


