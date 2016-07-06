package com.example.myapplication.magiccakeapp;

/**
 * Created by Alin on 6/19/2016.
 */
public class BackgroundsActivity {

    Integer colors[] = {
            R.color.red,
            R.color.pink,
            R.color.purple,
            R.color.deeppurple,
            R.color.indigo,
            R.color.blue,
            R.color.lightblue,
            R.color.cyan,
            R.color.teal,
            R.color.green,
            R.color.lightgreen,
            R.color.lime,
            R.color.amber,
            R.color.orange,
            R.color.deeporange,
            R.color.brown,
            R.color.grey,
            R.color.bluegrey
    };
    int i = -1;
    public int  getBackgrounds()
    {
        i++;
        try
        {
            return colors[i];
        }
        catch (Exception e)
        {
            i=0;
            return colors[i];
        }
    }
}
