package com.example.pc.service.pack3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pc.service.R;

public class BoundServiceActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnLayDuLieu;
    BoundService service;
    EditText edsoA, edsoB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service);

        btnLayDuLieu = findViewById(R.id.btnLayDuLieu);
        edsoA = findViewById(R.id.edsoA);
        edsoB = findViewById(R.id.edsoB);

        btnLayDuLieu.setOnClickListener(this);

        service = new BoundService();
        Intent intent = new Intent(this, BoundService.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);

    }

    ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            BoundService.LocalBinder localBinder = (BoundService.LocalBinder) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    public void onClick(View v) {
        int soA = Integer.parseInt(edsoA.getText().toString());
        int soB = Integer.parseInt(edsoB.getText().toString());

        int Tong = service.CongHaiSo(soA, soB);
        Toast.makeText(this, "Tổng 2 số là : " + Tong, Toast.LENGTH_SHORT).show();
    }
}
