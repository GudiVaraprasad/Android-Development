package com.example.countrydetails;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Country> countryList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        countryList.add(new Country(R.drawable.IndiaFlag, "India", "Capital city - Delhi"));
        countryList.add(new Country(R.drawable.USAFlag, "America", "Capital city - Washington DC"));
        countryList.add(new Country(R.drawable.AustraliaFlag, "Australia", "Capital city - Canberra"));
        countryList.add(new Country(R.drawable.JapanFlag, "Japan", "Capital city - Tokyo"));
        countryList.add(new Country(R.drawable.EnglandFlag, "England", "Capital city - London"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, countryList);

        listView.setAdapter(adapter);
    }
}