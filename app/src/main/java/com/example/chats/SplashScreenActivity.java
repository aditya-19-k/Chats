package com.example.chats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
                if (sharedPreferences.contains("isUserLogin")){
                    startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                    finish();
                }else {
                    startActivity(new Intent(SplashScreenActivity.this,AuthenticationActivity.class));
                    finish();
                }
            }
        },1000);
    }
}