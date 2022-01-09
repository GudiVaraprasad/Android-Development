package com.example.rb_currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
EditText inrValue, foreignValue;
RadioGroup rg;
RadioButton rb;
Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = (Button) findViewById(R.id.button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inrValue = (EditText) findViewById(R.id.editTextTextPersonName);
                foreignValue = (EditText) findViewById(R.id.editTextTextPersonName2);
                rg = findViewById(R.id.radioGroup);

                int options = rg.getCheckedRadioButtonId();
                rb = findViewById(options);

                int rupees =Integer.parseInt(inrValue.getText().toString());

                if(rb.getText().equals("USD"))
                {
                    foreignValue.setText(String.valueOf(rupees*0.013));
                }
                else if(rb.getText().equals("EURO"))
                {
                    foreignValue.setText(String.valueOf(rupees*0.011));
                }
                else if(rb.getText().equals("JAPANESE YEN"))
                {
                    foreignValue.setText(String.valueOf(rupees*1.52));
                }
                else if(rb.getText().equals("SAUDI RIYAL"))
                {
                    foreignValue.setText(String.valueOf(rupees*0.050));
                }
            }
        });
    }
}