package com.example.switch_toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton tb;
    private Switch wifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.toggleButton);
        wifi = findViewById(R.id.switch1);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                switch (buttonView.getId())
                {
//                    case R.id.switch1:
//                        if(isChecked)
//                            showMessage("Switch is ON");
//                        else
//                            showMessage("Switch is OFF");
                    case R.id.toggleButton:
                        if(isChecked)
                            showMessage("Toggle Button is ON");
                        else
                            showMessage("Toggle Button is OFF");
                }
            }
            private void showMessage(String message){
                Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
            }
        });
        wifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                switch (buttonView.getId())
                {
                    case R.id.switch1:
                        if(isChecked)
                            showMessage("Switch is ON");
                        else
                            showMessage("Switch is OFF");
//                    case R.id.toggleButton:
//                        if(isChecked)
//                            showMessage("Toggle Button is ON");
//                        else
//                            showMessage("Toggle Button is OFF");
                }
            }
            private void showMessage(String message){
                Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
            }
        });
    }
}