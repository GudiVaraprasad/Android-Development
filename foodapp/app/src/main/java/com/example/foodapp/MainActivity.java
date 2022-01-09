package com.example.foodapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Food> foodList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        foodList.add(new Food(R.drawable.idly, "Idly", "Rs. 20"));
        foodList.add(new Food(R.drawable.dosa, "Dosa", "Rs. 40"));
        foodList.add(new Food(R.drawable.puri, "Puri", "Rs. 35"));
        foodList.add(new Food(R.drawable.chapati, "Chapati", "Rs. 30"));
        foodList.add(new Food(R.drawable.pongal, "Pongal", "Rs. 35"));
        foodList.add(new Food(R.drawable.upma, "Upma", "Rs. 25"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, foodList);

        listView.setAdapter(adapter);
    }
}