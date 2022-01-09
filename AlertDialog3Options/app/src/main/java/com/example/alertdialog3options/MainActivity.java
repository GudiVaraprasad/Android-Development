package com.example.alertdialog3options;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);


        builder.setTitle("AlertDialog Example");


        builder.setMessage("This is an Example of Android AlertDialog with 3 Buttons!!");


        //Button One : Yes
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You clicked YES!", Toast.LENGTH_LONG).show();
            }
        });


        //Button Two : No
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You clicked NO!", Toast.LENGTH_LONG).show();
                dialog.cancel();
            }
        });


        //Button Three : Neutral
        builder.setNeutralButton("Can't Say!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You clicked Can't Say!", Toast.LENGTH_LONG).show();
                dialog.cancel();
            }
        });

        AlertDialog diag = builder.create();
        diag.show();
    }
}