package com.example.clothesorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] productNames = {"Casual Shirts", "Formal Shirts", "Sweatshirts",
            "Slim Fit Jeans", "Stylish Joggers", "Formal Trousers", "Casual Shorts / Tracks",
            "Suits / Blazers", "Kurta-Pyjama"};

            String discription = "The Fashion Hub - Mens";

    String[] costs = {"Rs. 849/-", "Rs. 699/-", "Rs.1399 /-", "Rs. 1899 /-", "Rs. 1499 /-", "Rs. 999 /-", "Rs. 299 /-", "Rs. 7999 /-", "Rs. 2999 /-"};
    int[] images = {R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4, R.drawable.i5,
            R.drawable.i6, R.drawable.i7, R.drawable.i8, R.drawable.i9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        MainAdapter adapter = new MainAdapter(MainActivity.this,productNames,discription,costs,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new
                        Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("image",images[position]);
                intent.putExtra("names",productNames[position]);
                intent.putExtra("disc",discription);
                intent.putExtra("cost",costs[position]);
                startActivity(intent);
            }
        });
    }
}