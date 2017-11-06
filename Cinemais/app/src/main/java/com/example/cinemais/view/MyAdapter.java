package com.example.cinemais.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cinemais.R;

class MyAdapter extends ArrayAdapter {

    int[] imageArray;
    String[] titleArray;
    String[] descArray;

    public MyAdapter(Context context, String[] titles1, String[] descriptions1, int[] img1) {
        //Overriding Default Constructor off ArratAdapter
        super(context, R.layout.example_cuslistview_row, R.id.idTitle, titles1);
        this.imageArray = img1;
        this.titleArray = titles1;
        this.descArray = descriptions1;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Inflating the layout
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.example_cuslistview_row, parent, false);
        //Get the reference to the view objects
        ImageView myImage = (ImageView) row.findViewById(R.id.idPic);
        TextView myTitle = (TextView) row.findViewById(R.id.idTitle);
        TextView myDescription = (TextView) row.findViewById(R.id.idDescription);
        //Providing the element of an array by specifying its position
        myImage.setImageResource(imageArray[position]);
        myTitle.setText(titleArray[position]);
        myDescription.setText(descArray[position]);
        return row;
    }
}
