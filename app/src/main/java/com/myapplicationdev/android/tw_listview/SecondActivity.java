package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> module;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("selectYear");
        tvYear.setText(year);

        module = new ArrayList<Module>();

        if (year.equals("Year 1")) {
            module.add(new Module("C208", true));
            module.add(new Module("B216", false));
            module.add(new Module("C105", true));

            aa = new ModuleAdapter(this, R.layout.row_second, module);
            lv.setAdapter(aa);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Module selectedModule = module.get(position);

                    Toast.makeText(SecondActivity.this, selectedModule.getCode()
                                    + " Programming: " + selectedModule.isProg(),
                            Toast.LENGTH_LONG).show();
                }
            });
        } else if (year.equals("Year 2")) {
            module.add(new Module("T202", false));
            module.add(new Module("C346", true));
            module.add(new Module("C348", true));

            aa = new ModuleAdapter(this, R.layout.row_second, module);
            lv.setAdapter(aa);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Module selectedModule = module.get(position);

                    Toast.makeText(SecondActivity.this, selectedModule.getCode()
                                    + " Programming: " + selectedModule.isProg(),
                            Toast.LENGTH_LONG).show();
                }
            });
        } else {
            module.add(new Module("C349", true));
            module.add(new Module("C347", true));
            module.add(new Module("C308", true));

            aa = new ModuleAdapter(this, R.layout.row_second, module);
            lv.setAdapter(aa);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Module selectedModule = module.get(position);

                    Toast.makeText(SecondActivity.this, selectedModule.getCode()
                                    + " Programming: " + selectedModule.isProg(),
                            Toast.LENGTH_LONG).show();
                }
            });
        }
/*        module.add(new Module("C208", true));
        module.add(new Module("B216", false));
        module.add(new Module("C105", true));

        aa = new ModuleAdapter(this, R.layout.row_second, module);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Module selectedModule = module.get(position);

                Toast.makeText(SecondActivity.this, selectedModule.getCode()
                                + " Programing: " + selectedModule.isProg(),
                        Toast.LENGTH_LONG).show();
            }
        });*/
    }



}
