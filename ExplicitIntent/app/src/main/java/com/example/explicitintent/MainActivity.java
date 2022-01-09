package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Std_Name;
    EditText Std_regNo;
    Button btsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Std_Name = (EditText)findViewById(R.id.editTextTextPersonName);
        Std_regNo = (EditText)findViewById(R.id.editTextTextPersonName2);
        btsend = (Button)findViewById(R.id.button);

        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDetails();
            }
        });
    }

    public void sendDetails() {
        String name = Std_Name.getText().toString().trim();
        String regno = Std_regNo.getText().toString();

        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra((String) SecondActivity.NAME, name);
        i.putExtra((String) SecondActivity.REGNO, regno);

        startActivity(i);
    }
}