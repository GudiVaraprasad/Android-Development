package com.example.intent2firstactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intent2firstactivity.MainActivity;

public class Main2Activity extends AppCompatActivity {
    EditText et3;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        int x = i.getIntExtra("argOne",0);
        int y = i.getIntExtra("argTwo", 0);
        result = x+y;
        et3 = findViewById(R.id.editTextTextPersonName);
        et3.setText(String.valueOf(result));

        Button bt = findViewById(R.id.resultSend);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reply = new Intent();
                reply.putExtra("result",result);
                setResult(RESULT_OK,reply);
                finish();
            }
        });
    }
}