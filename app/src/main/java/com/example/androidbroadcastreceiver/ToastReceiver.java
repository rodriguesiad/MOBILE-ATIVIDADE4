package com.example.androidbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "Dispositivo conectado à energia", Toast.LENGTH_SHORT).show();
        }
        else if(Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "Dispositivo desconectado da energia", Toast.LENGTH_SHORT).show();
        }
    }
}