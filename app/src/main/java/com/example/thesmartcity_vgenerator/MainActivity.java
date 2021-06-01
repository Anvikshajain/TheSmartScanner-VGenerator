package com.example.thesmartcity_vgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler=new Handler();
        handler.postDelayed(() -> {
            Intent intent=new Intent(MainActivity.this,login_activity.class);
            startActivity(intent);
            finish();
        },3000);
    }
}