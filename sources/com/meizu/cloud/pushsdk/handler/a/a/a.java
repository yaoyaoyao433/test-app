package com.meizu.cloud.pushsdk.handler.a.a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.a.a;
/* loaded from: classes3.dex */
public final class a {
    private Context a;
    private com.meizu.cloud.pushsdk.b.a.a b;
    private int c;
    private Notification d;

    public a(Context context) {
        this.a = context;
    }

    private void b() {
        this.c = 0;
        this.d = null;
        try {
            if (this.b != null) {
                this.b.a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.b = null;
        }
    }

    public final void a() {
        if (this.c <= 0 || this.d == null) {
            return;
        }
        try {
            ((NotificationManager) this.a.getSystemService(RemoteMessageConst.NOTIFICATION)).notify(this.c, this.d);
            DebugLogger.d("AdNotification", "again show old ad notification, notifyId:" + this.c);
        } catch (Exception e) {
            e.printStackTrace();
            DebugLogger.e("AdNotification", "again show old ad notification error:" + e.getMessage());
        }
        b();
    }

    public final void a(int i) {
        if (i <= 0 || this.c <= 0 || i != this.c) {
            return;
        }
        b();
        DebugLogger.d("AdNotification", "clean ad notification, notifyId:" + i);
    }

    public final void a(int i, Notification notification, int i2) {
        if (i <= 0 || notification == null) {
            return;
        }
        this.c = i;
        this.d = notification;
        if (i2 > 0) {
            if (this.b != null) {
                try {
                    try {
                        this.b.a();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } finally {
                    this.b = null;
                }
            }
            this.b = new com.meizu.cloud.pushsdk.b.a.a(this.a, new Runnable() { // from class: com.meizu.cloud.pushsdk.handler.a.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    DebugLogger.d("AdNotification", "ad priority valid time out");
                    a.this.a();
                }
            }, i2 * 60 * 1000);
            com.meizu.cloud.pushsdk.b.a.a aVar = this.b;
            if (aVar.i) {
                aVar.i = false;
                aVar.f = new a.C0523a();
                aVar.b.registerReceiver(aVar.f, new IntentFilter("alarm.util"));
                aVar.h = String.valueOf(System.currentTimeMillis());
                aVar.g = PendingIntent.getBroadcast(aVar.b, 0, new Intent("alarm.util"), 1073741824);
                if (Build.VERSION.SDK_INT >= 23) {
                    aVar.a.setExactAndAllowWhileIdle(aVar.e, System.currentTimeMillis() + aVar.d, aVar.g);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    aVar.a.setExact(aVar.e, System.currentTimeMillis() + aVar.d, aVar.g);
                } else {
                    aVar.a.set(aVar.e, System.currentTimeMillis() + aVar.d, aVar.g);
                }
                DebugLogger.i("AlarmUtils", "start delayed task, keyword: " + aVar.h);
            } else {
                DebugLogger.e("AlarmUtils", "last task not completed");
            }
        }
        DebugLogger.d("AdNotification", "save ad notification, notifyId:" + i);
    }
}
