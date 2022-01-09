package com.example.checkbox_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox reading, playing, watching, talking;
    Button btdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayCheckBox();
    }

    public void displayCheckBox()
    {
        // Finding CheckBox by its unique ID
        reading=(CheckBox)findViewById(R.id.checkBox);
        playing=(CheckBox)findViewById(R.id.checkBox2);
        watching=(CheckBox)findViewById(R.id.checkBox3);
        talking=(CheckBox)findViewById(R.id.checkBox4);
        btdisplay = (Button)findViewById(R.id.button);

        btdisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selection="";

                if(reading.isChecked())
                    selection = selection + " Reading Books\n ";
                if(playing.isChecked())
                    selection = selection + " Playing Cricket\n ";
                if(watching.isChecked())
                    selection = selection + " Watching Movies\n ";
                if(talking.isChecked())
                    selection = selection + " Talking with friends\n ";

                Toast.makeText(MainActivity.this, selection + " are your hobbies..", Toast.LENGTH_LONG).show();
            }
        });


    }
}