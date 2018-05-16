package com.example.pc.service.Pack2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class IntentService extends android.app.IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public IntentService() {
        super("haipro");
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        synchronized (this){
            int dem = 0;
            while (dem<20){
                try {
                    wait(1000);
                    Log.d("DemIntentService",""+ dem);
                    dem++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "IntentService đã dừng", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
