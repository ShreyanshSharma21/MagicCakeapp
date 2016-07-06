package com.example.myapplication.magiccakeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    // ###################### Here i write the code to create the RETETE and SOCIAL button

    private static Button btn_retete;
    private static Button btn_social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // #################### method for btn_retete
        OnClickButtonListener();
        // #################### method for btn_social
        OnClickButtonListener2();
    }

    // #################### here i create the method for btn_retete

    public void OnClickButtonListener(){
        btn_retete=(Button)findViewById(R.id.btnretete);
        btn_retete.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.example.myapplication.magiccakeapp.ReteteActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    // ##################### Here i create the method for my btn_social

    public void OnClickButtonListener2(){
        btn_social=(Button)findViewById(R.id.btnsocial);
        btn_social.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.example.myapplication.magiccakeapp.SocialActivity");
                        startActivity(intent);
                    }
                }
        );
    }

}
