package com.barranquero.basicservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by usuario on 17/02/17
 * BasicService
 */

public class InfiniteService extends Service {
    private int cont = 0;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        Toast.makeText(this, "Infinite Service" + (++cont), Toast.LENGTH_SHORT).show();

        return START_STICKY;
    }
}
