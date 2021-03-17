package com.example.servicescomponent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceClass extends Service {
    public ServiceClass(){}
    int startMode;
    IBinder iBinder;
    boolean rebind;

    public void onCreate(){
        Log.d("create","service started");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return startMode;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return rebind;
    }

    public void onRebind(Intent intent){
        Log.d("rebind","Rebind Method");
    }

    @Override
    public void onDestroy() {
        Log.d("destroy","Destroy Method");
    }
}
