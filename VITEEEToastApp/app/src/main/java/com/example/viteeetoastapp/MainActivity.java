package com.example.viteeetoastapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText t2,t3;
    RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t3=findViewById(R.id.t3);
        t2=findViewById(R.id.t2);
        String a=t3.getText().toString();
        int aa=Integer.parseInt(a);
        String b=t2.getText().toString();
        int bb=Integer.parseInt(b);
        if(aa<70){
            Toast.makeText(MainActivity.this,"Not eligible for B.Tech",Toast.LENGTH_LONG).show();
        }
        if(aa>=70){
            if((bb<20000 && r1.isSelected()) || (bb<30000 &&
                    r2.isSelected() ) || (bb<40000 && r3.isSelected()) ||(bb>=40000 &&
                    r4.isSelected())){
                Toast.makeText(MainActivity.this,"Seat Allotted",Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(MainActivity.this,"Seat Not Allotted",Toast.LENGTH_LONG).show();
            }
        }
    }
}