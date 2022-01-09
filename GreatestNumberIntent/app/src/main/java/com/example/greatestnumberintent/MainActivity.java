package com.example.greatestnumberintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
    EditText num1,num2,num3;
    TextView res;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.numOne);
        num2 = findViewById(R.id.numTwo);
        num3 = findViewById(R.id.numThree);
        res = findViewById(R.id.output);
        submit = findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("argOne", Integer.parseInt(num1.getText().toString()));
                intent.putExtra("argTwo", Integer.parseInt(num2.getText().toString()));
                intent.putExtra("argThree", Integer.parseInt(num3.getText().toString()));
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
                submit.setVisibility(View.INVISIBLE);
                num1.setVisibility(View.INVISIBLE);
                num2.setVisibility(View.INVISIBLE);
                num3.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                res.setText("The greatest is "+String.valueOf(x));
            }
        }
    }
}