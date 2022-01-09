package com.example.greatestnumberintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    EditText et3;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        int x = i.getIntExtra("argOne",0);
        int y = i.getIntExtra("argTwo", 0);
        int z = i.getIntExtra("argThree", 0);

        if(x > y && x > z)
        {
            result = x;
            Intent reply = new Intent();
            reply.putExtra("result",result);
            setResult(RESULT_OK,reply);
            finish();
        }
        else if(y > z)
        {
            result = y;
            Intent reply = new Intent();
            reply.putExtra("result",result);
            setResult(RESULT_OK,reply);
            finish();
        }
        else
        {
            result = z;
            Intent reply = new Intent();
            reply.putExtra("result",result);
            setResult(RESULT_OK,reply);
            finish();
        }
    }
}
