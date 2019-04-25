package com.myapplicationdev.android.tw_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {


    ArrayList<Year> year;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=this.findViewById(R.id.lvYear);

        //Create a few year objects in year array
        year=new ArrayList<Year>();
        year.add(new Year("Year 1"));
        year.add(new Year("Year 2"));
        year.add(new Year("Year 3"));


       aa=new YearAdapter(this,R.layout.rowyear,year);
       lv.setAdapter(aa);





    }
}
