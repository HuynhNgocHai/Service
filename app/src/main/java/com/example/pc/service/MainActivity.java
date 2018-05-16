package com.example.pc.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pc.service.Pack2.IntentService;
import com.example.pc.service.Pack2.IntentServiceActivity;
import com.example.pc.service.pack1.StartingServiceActivity;
import com.example.pc.service.pack3.BoundService;
import com.example.pc.service.pack3.BoundServiceActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPack1, btnPack2, btnPack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPack1 = findViewById(R.id.btnPack1);
        btnPack2 = findViewById(R.id.btnPack2);
        btnPack3 = findViewById(R.id.btnPack3);
        btnPack1.setOnClickListener(this);
        btnPack2.setOnClickListener(this);
        btnPack3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPack1:
                Intent i = new Intent(this, StartingServiceActivity.class);
                startActivity(i);
                break;
            case R.id.btnPack2:
                Intent i1 = new Intent(this, IntentServiceActivity.class);
                startActivity(i1);
                break;
            case R.id.btnPack3:
                Intent i2 = new Intent(this, BoundServiceActivity.class);
                startActivity(i2);
                break;
        }
    }
}
