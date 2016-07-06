package com.example.myapplication.magiccakeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alin on 6/01/2016.
 */



class CustomAdapter extends ArrayAdapter<String> {

    private final int[] imgs;

    public CustomAdapter(Context context, String[] cakes, int[] imgs) {
        super(context,R.layout.custom_row, cakes);

        this.imgs= imgs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater lavisInflater = LayoutInflater.from(getContext());
        View customView = lavisInflater.inflate(R.layout.custom_row, parent, false);

        String singleCakeItem = getItem(position);
        TextView cake_title = (TextView) customView.findViewById(R.id.cake_title);
        ImageView cake_image = (ImageView) customView.findViewById(R.id.cake_image);

        cake_title.setText(singleCakeItem);
        cake_image.setImageResource(imgs[position]);
        return customView;

    }
}
