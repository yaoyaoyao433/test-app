package com.tencent.map.geolocation;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class s extends Service {
    public static boolean removeNotification = true;
    private volatile boolean isStartForeground = false;
    private MyBinder mBinder = new MyBinder();

    @Override // android.app.Service
    public void onCreate() {
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        c.b(this);
        super.onDestroy();
        if (this.isStartForeground) {
            this.isStartForeground = false;
            try {
                stopForeground(removeNotification);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        if (this.isStartForeground) {
            this.isStartForeground = false;
            try {
                stopForeground(removeNotification);
            } catch (Throwable unused) {
            }
        }
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            Notification notification = (Notification) intent.getExtras().get("LocNotification");
            int intValue = ((Integer) intent.getExtras().get("LocNotificationId")).intValue();
            if (intValue > 0 && notification != null && !this.isStartForeground) {
                startForeground(intValue, notification);
                this.isStartForeground = true;
            }
        } catch (Throwable unused) {
        }
        return this.mBinder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class MyBinder extends Binder {
        public MyBinder() {
        }

        public s getService() {
            return s.this;
        }
    }
}
