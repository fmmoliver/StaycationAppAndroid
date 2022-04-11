package com.example.staycationappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().setTitle("");

        //Calling the MainActivity
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                Intent intent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}