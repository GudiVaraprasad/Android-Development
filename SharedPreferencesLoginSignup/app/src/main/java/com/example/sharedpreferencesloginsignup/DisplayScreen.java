package com.example.sharedpreferencesloginsignup;

import android.content.SharedPreferences;
import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DisplayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);

        SharedPreferences preferences = getSharedPreferences("MYDATA", MODE_PRIVATE);
        String display = preferences.getString("display", "");

        TextView mydetails = (TextView) findViewById(R.id.userdetails);
        mydetails.setText(display);
    }
}