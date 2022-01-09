package com.example.googlekeepapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.DatePickerDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker; import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private int[] Date1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1=(EditText)findViewById(R.id.ETD1);
        Button b1=(Button)findViewById(R.id.DB1);

        Date1=new int [3];

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date(Date1,et1);
            }
        });
    }
    void date(final int[]d, final EditText e)
    {
        final Calendar c1 = Calendar.getInstance(); d[0] = c1.get(Calendar.YEAR);
        d[1] = c1.get(Calendar.MONTH);
        d[2] = c1.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                e.setText(String.valueOf(dayOfMonth+"/"+(month+1)+"/"+year)); d[0]=dayOfMonth;
                d[1]=month; d[2]=year;
            }
        },d[0],d[1],d[2]);
        datePickerDialog.show();
    }

    final Spinner spinner = (Spinner) findViewById(R.id.spinner);
    Button button=(Button)findViewById(R.id.button);

        spinner.setOnItemSelectedListener(this);

    List<String> categories = new ArrayList<String>();
        categories.add("morning");
        categories.add("afternoon");
        categories.add("evening");
        categories.add("night");

    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            addNotification();
        }
    }

    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.abc)
                        .setContentTitle("Notification as a Wish")
                        .setContentText("Good Morning");
                        .setContentText("Good Afternoon");
                        .setContentText("Good Evening");
                        .setContentText("Good Night");

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}
}
