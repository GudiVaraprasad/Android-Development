package com.example.sharedpreferencesloginsignup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static int attempts=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userName = (EditText) findViewById(R.id.usernamenew);
        final EditText password = (EditText) findViewById(R.id.passwordnew);
        Button btnRegister = (Button) findViewById(R.id.btnNewRegister);
        Button btnLogin = (Button) findViewById(R.id.loginbtn);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user = Integer.parseInt(userName.getText().toString());
                int userpassword = Integer.parseInt(password.getText().toString());
                if(userpassword != (user*user)+5)
                {
                    attempts--;
                    if(attempts==0){
                        Toast.makeText(getApplicationContext(), "Maximum attempts reached", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Try again!!" + "Attempts left are : " + attempts, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    SharedPreferences preferences = getSharedPreferences("MYDATA", MODE_PRIVATE);

                    String userDetails = preferences.getString(user + userpassword + "data","No information on that user.");
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("display",userDetails);
                    editor.commit();

                    Intent displayScreen = new Intent(MainActivity.this, DisplayScreen.class);
                    startActivity(displayScreen);
                }
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("MYDATA",MODE_PRIVATE);
                String newUser  = userName.getText().toString();
                String newPassword = password.getText().toString();

                if(Integer.parseInt(newPassword) != (Integer.parseInt(newUser)*Integer.parseInt(newUser))+5)
                {
                    Toast.makeText(getApplicationContext(),"Try again",Toast.LENGTH_SHORT).show();
                }
                else {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString(newUser, newUser);
                    editor.commit();
                    editor.putString(newPassword, newPassword);
                    editor.commit();
                    editor.putString(newUser + newPassword + "data", newUser + "\n");
                    editor.commit();

                    Intent displayScreen = new Intent(MainActivity.this, DisplayScreen.class);
                    startActivity(displayScreen);
                }
            }
        });
    }
}