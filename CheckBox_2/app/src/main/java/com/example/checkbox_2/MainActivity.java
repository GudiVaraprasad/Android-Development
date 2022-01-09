package com.example.checkbox_2;

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
        //displayCheckBox()
        ListnerCheckBox();
    }

    public void ListnerCheckBox() {
        // Finding CheckBox by its unique ID
        reading=(CheckBox)findViewById(R.id.checkBox);
        reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()) {
                    Toast.makeText(MainActivity.this, " \nReading books is one of your hobby", Toast.LENGTH_LONG).show();
                }
            }
        });
        playing=(CheckBox)findViewById(R.id.checkBox2);
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()) {
                    Toast.makeText(MainActivity.this," \nPlaying Cricket is one of your hobby", Toast.LENGTH_LONG).show();
                }
            }
        });
        watching=(CheckBox)findViewById(R.id.checkBox3);
        watching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()) {
                    Toast.makeText(MainActivity.this," \nWatching Movies is one of your hobby", Toast.LENGTH_LONG).show();
                }
            }
        });
        talking=(CheckBox)findViewById(R.id.checkBox4);
        talking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()) {
                    Toast.makeText(MainActivity.this," \nTalking with Friends is one of your hobby", Toast.LENGTH_LONG).show();
                }
            }
        });

        //btdisplay = (Button)findViewById(R.id.button);
    }

//
//    public void displayCheckBox()
//    {
//        // Finding CheckBox by its unique ID
//        reading=(CheckBox)findViewById(R.id.checkBox);
//        playing=(CheckBox)findViewById(R.id.checkBox2);
//        watching=(CheckBox)findViewById(R.id.checkBox3);
//        talking=(CheckBox)findViewById(R.id.checkBox4);
//        btdisplay = (Button)findViewById(R.id.button);
//
//        btdisplay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String selection="";
//
//                if(reading.isChecked())
//                    selection = selection + " Reading Books\n ";
//                if(playing.isChecked())
//                    selection = selection + " Playing Cricket\n ";
//                if(watching.isChecked())
//                    selection = selection + " Watching Movies\n ";
//                if(talking.isChecked())
//                    selection = selection + " Talking with friends\n ";
//
//                Toast.makeText(MainActivity.this, selection + " are your hobbies..", Toast.LENGTH_LONG).show();
//            }
//        });
//    }
}