package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final Object NAME = "NAME";
    public static final Object REGNO = "REGNO";

    TextView stdName, stdRegNO;
    String name, regno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        stdName = (TextView) findViewById(R.id.textView2);
        stdRegNO = (TextView) findViewById(R.id.textView3);

        Intent i = getIntent();
        name = i.getStringExtra((String) NAME);
        regno = i.getStringExtra((String) REGNO);

        stdName.setText("Welcome Mr. " + name);
        stdRegNO.setText("Your Registration number is " + regno);
    }
}