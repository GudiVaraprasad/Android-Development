package com.example.autocompletetextview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String[] course = new String[]{"DBMS", "OS", "MAD", "OOPS", "DMS"};
    private static final String[] school = new String[]{"SCOPE", "SENSE", "SMEC", "VSB", "VSL", "VISH"};
    private static final String[] country = new String[]{"AMERICA", "AUSTRALIA", "INDIA", "IRELAND", "RUSSIA", "ROMANIA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] vitap_course = getResources().getStringArray(R.array.vitcourse);
        String[] vitap_school = getResources().getStringArray(R.array.vitschool);
        String[] vitap_country = getResources().getStringArray(R.array.vitcountry);

        AutoCompleteTextView actv1 = findViewById(R.id.schoolID);
        ArrayAdapter<String> adap1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vitap_course);

        AutoCompleteTextView actv2 = findViewById(R.id.schoolID5);
        ArrayAdapter<String> adap2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vitap_school);

        AutoCompleteTextView actv3 = findViewById(R.id.schoolID6);
        ArrayAdapter<String> adap3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vitap_country);

        actv1.setAdapter(adap1);
        actv2.setAdapter(adap2);
        actv3.setAdapter(adap3);
    }
}