package com.example.mycourses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText regno;
    Button buttonSubmit;
    CheckBox MAD, netprog, cybersec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editTextTextPersonName);
        regno = (EditText) findViewById(R.id.editTextTextPersonName2);
        buttonSubmit = (Button) findViewById(R.id.button);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                displayCheckBox(name, regno);
            }
        });
    }
    public void displayCheckBox(EditText name, EditText regno)
    {
        // Finding CheckBox by its unique ID
        MAD=(CheckBox)findViewById(R.id.checkBox4);
        netprog=(CheckBox)findViewById(R.id.checkBox5);
        cybersec=(CheckBox)findViewById(R.id.checkBox6);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selection="";

                if(MAD.isChecked())
                    selection = selection + "MAD\n";
                if(netprog.isChecked())
                    selection = selection + "Network Programming\n";
                if(cybersec.isChecked())
                    selection = selection + "Cyber Security.\n";

                Toast.makeText(MainActivity.this, "Your Name is " + name.getText().toString() + "\n" + "Your Registration No. is " + regno.getText().toString() + "\n" + selection + " are your courses", Toast.LENGTH_LONG).show();
            }
        });
    }
}