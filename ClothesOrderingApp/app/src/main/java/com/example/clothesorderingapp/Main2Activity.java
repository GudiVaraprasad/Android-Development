package com.example.clothesorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private TextView name, disc, price;
    private ImageView iv1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = (TextView) findViewById(R.id.textView5);
        disc = (TextView) findViewById(R.id.textView6);
        price = (TextView) findViewById(R.id.textView7);
        iv1 = (ImageView) findViewById(R.id.imageView2);
        b1 = (Button) findViewById(R.id.button);
        Intent i = getIntent();
        name.setText(i.getStringExtra("names"));
        disc.setText(i.getStringExtra("disc"));
        price.setText(i.getStringExtra("cost"));
        iv1.setImageResource(i.getIntExtra("image", 0));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Item added to cart !",Toast.LENGTH_SHORT).show();
            }
        });
    }
}