package com.example.actv;

import static com.example.actv.R.array.vitschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    //private static final String[] school = new String[]{"SCOPE", "SENSE", "SMEC", "VSB", "VSL", "VISH"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] vitap_school = getResources().getStringArray(R.array.vitschool);

        AutoCompleteTextView actv = findViewById(R.id.schoolID);
        //ArrayAdapter<String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, school);
        ArrayAdapter<String> adap2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vitap_school);
        //actv.setAdapter(adap);
        actv.setAdapter(adap2);
    }
}