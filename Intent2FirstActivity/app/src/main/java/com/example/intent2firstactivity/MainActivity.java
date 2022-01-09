package com.example.intent2firstactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
    EditText arg1,arg2;
    TextView res;
    Button strtPrcs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arg1 = findViewById(R.id.argOne);
        arg2 = findViewById(R.id.argTwo);
        res = findViewById(R.id.resView);
        strtPrcs = findViewById(R.id.sendBtn);
        strtPrcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new
                        Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("argOne", Integer.parseInt(arg1.getText().toString()));
                intent.putExtra("argTwo", Integer.parseInt(arg2.getText().toString()));
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                int x = data.getIntExtra("result",0);
                res.setText(String.valueOf(x));
                Toast.makeText(getApplicationContext(),"Result obtained back from Intent 2 is = "+String.valueOf(x),Toast.LENGTH_LONG).show();
            }
        }
    }
}