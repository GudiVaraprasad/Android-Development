package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText edTxt;
    Button mail, browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt = (EditText)findViewById(R.id.editTextTextPersonName);
    }
    public void openBrowser(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://gudivaraprasad.github.io/GVP/"));

        if(i.resolveActivity(getPackageManager())!=null) {
            startActivity(i);
        }
    }

    public void sendMail(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        String[] mailid = {"gudi.varaprasad@gmail.com", "nikhilesh.19bce7274@vitap.ac.in", "varaprasad.19bce7048@vitap.ac.in"};
        i.putExtra(Intent.EXTRA_EMAIL, mailid);
        i.putExtra(Intent.EXTRA_SUBJECT, "A simple App to send mail using Implicit Intents");
        String msg = edTxt.getText().toString();
        i.putExtra(Intent.EXTRA_TEXT, msg);

        if(i.resolveActivity(getPackageManager())!=null) {
            startActivity(i);
        }
    }
}