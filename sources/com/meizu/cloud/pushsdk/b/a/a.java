package com.meizu.cloud.pushsdk.b.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import com.meizu.cloud.pushinternal.DebugLogger;
/* loaded from: classes3.dex */
public final class a {
    public AlarmManager a;
    public Context b;
    Runnable c;
    public long d;
    public int e;
    public C0523a f;
    public PendingIntent g;
    public String h;
    public boolean i;

    public a(Context context, Runnable runnable, long j) {
        this(context, runnable, j, true);
    }

    private a(Context context, Runnable runnable, long j, boolean z) {
        this.b = context.getApplicationContext();
        this.c = runnable;
        this.d = j;
        this.e = 0;
        this.a = (AlarmManager) this.b.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.i = true;
    }

    public final void a() {
        if (this.a != null && this.g != null && !this.i) {
            DebugLogger.i("AlarmUtils", "cancel  delayed task, keyword: " + this.h);
            this.a.cancel(this.g);
        }
        b();
    }

    void b() {
        try {
            if (this.f != null) {
                this.b.unregisterReceiver(this.f);
                this.f = null;
            }
        } catch (Exception e) {
            DebugLogger.e("AlarmUtils", "clean error, " + e.getMessage());
        }
    }

    /* renamed from: com.meizu.cloud.pushsdk.b.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0523a extends BroadcastReceiver {
        private C0523a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.getAction().equals("alarm.util")) {
                return;
            }
            DebugLogger.i("AlarmUtils", "on receive delayed task, keyword: " + a.this.h);
            a.this.i = true;
            a.this.b();
            a.this.c.run();
        }
    }
}
