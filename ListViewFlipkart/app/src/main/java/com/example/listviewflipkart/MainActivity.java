package com.example.listviewflipkart;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Flipkart> flipList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        flipList.add(new Flipkart("Flipkart Plus"));
        flipList.add(new Flipkart("My Orders"));
        flipList.add(new Flipkart("Flipkart Pay Later"));
        flipList.add(new Flipkart("Wish List"));
        flipList.add(new Flipkart("Payment Details"));
        flipList.add(new Flipkart("Cancelled Order"));
        flipList.add(new Flipkart("Pending Payment"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.activity_listview, flipList);

        listView.setAdapter(adapter);
    }
}