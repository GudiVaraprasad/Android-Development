package com.example.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    EditText eName;
//    Button edisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText eName = (EditText)findViewById(R.id.labname);
        Button edisplay = (Button)findViewById(R.id.ebutton);

        edisplay.setOnClickListner(new View.onClickListner() {
            // Displaying Toast Message
            Toast.makeText(getApplicationContext(),"Welcome to " + eName,Toast.LENGTH_SHORT).show();
        });

    }
}