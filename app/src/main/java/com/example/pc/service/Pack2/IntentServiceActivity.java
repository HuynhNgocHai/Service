package com.example.pc.service.Pack2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pc.service.R;

public class IntentServiceActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnStartIntentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service);

        btnStartIntentService = findViewById(R.id.btnStartIntentService);
        btnStartIntentService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,IntentService.class);
        startService(i);
    }
}
