package com.example.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    Animation fab_open, fab_close, fab_clock, fab_anticlock;
    
    FloatingActionButton fab_plus, fab_camera, fab_call, fab_bt;
    boolean isOpen, isClose;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fab_plus = (FloatingActionButton) findViewById(R.id.menu);
        fab_camera = (FloatingActionButton) findViewById(R.id.cam);
        fab_call = (FloatingActionButton) findViewById(R.id.call);
        fab_bt = (FloatingActionButton) findViewById(R.id.recycle);
        
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.fab_close);
        fab_clock = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.fab_clockwise);
        fab_anticlock = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.fab_anticlockwise);

        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOpen) {
                    fab_camera.startAnimation(fab_open);
                    fab_call.startAnimation(fab_open);
                    fab_bt.startAnimation(fab_open);

                    fab_plus.startAnimation(fab_clock);
                    fab_camera.setClickable(true);
                    fab_call.setClickable(true);
                    isOpen = true;
                }
                else {
                    fab_camera.startAnimation(fab_close);
                    fab_call.startAnimation(fab_close);
                    fab_bt.startAnimation(fab_close);

                    fab_plus.startAnimation(fab_anticlock);
                    fab_camera.setClickable(false);
                    fab_call.setClickable(false);
                    isOpen = false;
                }
            }
        });
    }
}