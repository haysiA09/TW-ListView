package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class YearAdapter extends ArrayAdapter<Year> {
    private ArrayList<Year> year;
    private Context context;
    private TextView tvYear;

    public YearAdapter(Context context, int resource,ArrayList<Year> objects){
        super(context,resource,objects);
        //store the year to the adapter
        year=objects;
        //store the context to use later
        this.context=context;
    }

    //getView() method to call te view object everytime lv needs row
    @Override
    public View getView(int positions, View convertView, ViewGroup parent) {
        //get LayoutInflator object to "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflate the row.xml
        View rowView = inflater.inflate(R.layout.rowyear, parent, false);

        //get tv object
        tvYear = rowView.findViewById(R.id.tvYear);

        //"position" is the index of the row LV is requesting
        Year currentYear = year.get(positions);

        //set tv to show year
        tvYear.setText(currentYear.getNumber());

        //return view to lv
        return rowView;
    }
    }


