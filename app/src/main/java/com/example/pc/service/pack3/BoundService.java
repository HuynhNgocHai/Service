package com.example.pc.service.pack3;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class BoundService extends Service {
    IBinder iBinder = new LocalBinder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public class LocalBinder extends Binder{
        LocalBinder getLocalBinder(){
            return LocalBinder.this;
        }
    }

    public String XinChao(){
        return "Xin chào các bạn !";
    }

    public int CongHaiSo(int soA, int soB){
        return soA + soB;
    }
}
