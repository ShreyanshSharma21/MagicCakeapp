package com.example.myapplication.magiccakeapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FactsActivity extends AppCompatActivity {

    TextView textFacts;
    RelativeLayout bg;
    Facts factHolder = new Facts();
    BackgroundsActivity backs = new BackgroundsActivity();



    //since the getResource.getColor is deprecated i try the new solution they provide us OR not because i can see it works

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
        textFacts=(TextView)findViewById(R.id.textFacts);
        bg = (RelativeLayout) findViewById(R.id.Background);
        // here i add the codes for the changing colors of backgrounds
        bg.setBackgroundColor(getResources().getColor(backs.getBackgrounds()));
        // here i try the new solution they provide for getColor

        bg.setOnTouchListener(new OnSwipeTouchListener(this){
            public void onSwipeTop(){

            }
            public void onSwipeRight(){
                prev();
            }
            public void onSwipeLeft(){
                next();
            }
            public void onSwipeBottom(){

            }
            public boolean onTouch(View v, MotionEvent event){
                return gestureDetector.onTouchEvent(event);
            }
        });
    }

    private void next(){
        textFacts.setText(factHolder.nextFact());

        // for the background to change everytime a next fact appears we need to add the code here also
        bg.setBackgroundColor(getResources().getColor(backs.getBackgrounds()));
    }

    private void prev() {
        textFacts.setText(factHolder.prevFact());
        // for the background to change everytime a prev fact appears we need to add the code here also
        bg.setBackgroundColor(getResources().getColor(backs.getBackgrounds()));
    }


    public void genFact(View view)
    {
        textFacts.setText(factHolder.nextFact());
    }

}