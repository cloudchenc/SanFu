package com.example.sanfuproject.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sanfuproject.MainActivity;
import com.example.sanfuproject.R;

public class SplashActivity extends AppCompatActivity {

    Intent it = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }

    private void init() {

        SharedPreferences sp = getSharedPreferences("args", Context.MODE_PRIVATE);
        boolean isGuid = sp.getBoolean("isGuid", false);
        //已经引导过
        if (isGuid) {
            it = new Intent(this, MainActivity.class);
        } else {
            it = new Intent(this, GuideActivity.class);
        }

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(3000);
                    startActivity(it);
                } catch (Exception e) {
                }
            }
        }.start();

    }
}














