package com.example.studentregistrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText regno;
    RadioGroup rg;
    RadioButton rb;
    Button buttonSubmit;
    CheckBox java, python, c, c_;

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
        java=(CheckBox)findViewById(R.id.checkBox3);
        python=(CheckBox)findViewById(R.id.checkBox4);
        c=(CheckBox)findViewById(R.id.checkBox5);
        c_=(CheckBox)findViewById(R.id.checkBox6);
        rg = findViewById(R.id.radioGroup);

        int options = rg.getCheckedRadioButtonId();
        rb = findViewById(options);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selection="";

                if(java.isChecked())
                    selection = selection + "Java, ";
                if(python.isChecked())
                    selection = selection + "Python, ";
                if(c.isChecked())
                    selection = selection + "C Programming, ";
                if(c_.isChecked())
                    selection = selection + "C#.";

                Toast.makeText(MainActivity.this, "Your Name is - " + name.getText().toString() + "\n" +
                        "Your Registration No. is - " + regno.getText().toString() + "\n" +
                        "Your Gender is - " + rb.getText() + "\n" +
                        selection + " are your courses", Toast.LENGTH_LONG).show();
            }
        });
    }
}